
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    private int next(int cal, int limit) {
        if (cal == limit) {
            return 1;
        } else {
            return cal + 1;
        }
    }

    public void advance() {
        this.day = next(this.day, 30);
        if (this.day == 1) {
            this.month = next(this.month, 12);
            if (this.month == 1) {
                this.year++;
            }
        }
    }

    public void advance(int days) {
        int day = 0;
        while (day < days) {
            this.advance();
            day++;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }
}
