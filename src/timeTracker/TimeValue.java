package timeTracker;

import org.jetbrains.annotations.NotNull;


public class TimeValue {

    private int _hour;
    private int _minute;

    public TimeValue(String time) {
        var timeArray = splitTimeString(time);
        setHour(timeArray[0]);
        setMinute(timeArray[1]);
    }

    public TimeValue(String hour, String minute) {
        setHour(hour);
        setMinute(minute);
    }

    private String[] splitTimeString(@NotNull String time) {
        if (!time.contains(":")) {
            throw new IllegalArgumentException("Separator ':' is missing");
        }
        String[] splitted = time.split(":");
        if (splitted.length > 2) {
            throw new IllegalArgumentException("Only one separator ':' allowed");
        }
        if (splitted.length < 2) {
            throw new IllegalArgumentException("You need to enter hours and minutes");
        }
        return splitted;
    }

    public int getHour() {
        return _hour;
    }

    private void setHour(@NotNull String hour) {
        if (hour.isEmpty()) {
            throw new IllegalArgumentException("You need to enter an hour");
        }
        int hourValue = Integer.valueOf(hour);
        if (hourValue < 0 || hourValue > 23) {
            throw new IllegalArgumentException("The hour value must be between 0 and 23");
        }
        _hour = hourValue;
    }

    public int getMinute() {
        return _minute;
    }

    private void setMinute(@NotNull String minute) {
        if (minute.isEmpty()) {
            throw new IllegalArgumentException("You need to enter minutes");
        }
        int minuteValue = Integer.valueOf(minute);
        if (minuteValue < 0 || minuteValue > 59) {
            throw new IllegalArgumentException("The minute value must be between 0 and 59");
        }
        _minute = minuteValue;
    }
}
