package timeTracker;

public class WorkingYear {
    private int year;
    private WorkingDay[][] months;
    private boolean leap_year;

    public WorkingYear(int year) {
        if (year < 1900 || year > 2200) {
            throw new IllegalArgumentException("Sorry, this application supports only years between 1900 and 2200");
        }
        this.year = year;

        leap_year = (year - 1900) % 4 == 0 && year != 2100;

        months = new WorkingDay[12][];
        for (int month = 1; month <= 12; month++) {
            int days;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    days = leap_year ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    throw new IllegalArgumentException("Month not found.");
            }
            months[month - 1] = new WorkingDay[days];
        }
    }

    public int getYear() {
        return year;
    }

    public WorkingDay[][] getMonths() {
        return months;
    }

    public boolean isLeapYear() {
        return leap_year;
    }
}
