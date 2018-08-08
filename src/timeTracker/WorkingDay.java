package timeTracker;

import java.util.ArrayList;
import java.util.Comparator;

public class WorkingDay {

    private Weekday weekday;
    private ArrayList<TimeValue> times;
    private int duration;

    public WorkingDay(Weekday weekday) {
        this.weekday = weekday;
        times = new ArrayList<>();
    }

    public void addTimeValue(TimeValue timeValue) {
        times.add(timeValue);
        updateDuration();
    }

    private void updateDuration() {
        duration = 0;
        if (times.size() < 2)
            return;
        times.sort(new Comparator<TimeValue>() {
            @Override
            public int compare(TimeValue o1, TimeValue o2) {
                int compared = (o1.getHour() - o2.getHour()) * 60;
                if (compared == 0)
                    compared = o1.getMinute() - o2.getMinute();
                return compared;
            }
        });
        for (int i = 0; i < times.size(); i += 2) {
            duration += (times.get(i + 1).getHour() - times.get(i).getHour()) * 60;
            duration += times.get(i + 1).getMinute() - times.get(i).getMinute();
        }
    }

    public int getDuration() {
        return duration;
    }

    public Weekday getWeekday() {
        return weekday;
    }
}
