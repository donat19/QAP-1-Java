/**
 * The Date class represents a calendar date with day, month, and year.
 */
public class Date {
    // Instance variables
    private int day;
    private int month;
    private int year;
    
    /**
     * Constructor to initialize a date with specific day, month, and year
     * @param day the day of the month (1-31)
     * @param month the month (1-12)
     * @param year the year
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * Gets the day of the month
     * @return the day
     */
    public int getDay() {
        return day;
    }
    
    /**
     * Gets the month
     * @return the month
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Gets the year
     * @return the year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Sets the day of the month
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * Sets the month
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    
    /**
     * Sets the year
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * Returns the date in the format "DD/MM/YYYY"
     * @return the formatted date string
     */
    @Override
    public String toString() {
        // Format with leading zeros for day and month if needed
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
