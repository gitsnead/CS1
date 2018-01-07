
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
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

    public int differenceInYears(MyDate comparedDate) {

        // Line up the two dates in order firstDate and secondDate.
        MyDate firstDate;
        MyDate secondDate;
        if (this.earlier(comparedDate)) {
            firstDate = new MyDate(this.day, this.month, this.year);
            secondDate = comparedDate;
        } else {
            firstDate = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
            secondDate = this;
        }

        // Count up the days between comparedDate and this MyDate.
        int days = 0;
        while (firstDate.earlier(secondDate)) {
            firstDate.advance();
            days++;
        }

        // Find and return the number of whole years in the counted days.
        int years = (days / 360);
        return years;
    }
}
