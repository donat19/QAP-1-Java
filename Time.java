/**
 * The Time class represents a time of day with hours, minutes, and seconds.
 * Includes methods to advance or roll back time by one second.
 */
public class Time {
    // Instance variables
    private int hour;   // 0-23
    private int minute; // 0-59
    private int second; // 0-59
    
    /**
     * Constructor to initialize time with specific hour, minute, and second
     * @param hour the hour (0-23)
     * @param minute the minute (0-59)
     * @param second the second (0-59)
     */
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    
    /**
     * Sets the time to the specified values
     * @param hour the hour to set
     * @param minute the minute to set
     * @param second the second to set
     */
    public void setTime(int hour, int minute, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }
    
    /**
     * Gets the hour
     * @return the hour
     */
    public int getHour() {
        return hour;
    }
    
    /**
     * Gets the minute
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }
    
    /**
     * Gets the second
     * @return the second
     */
    public int getSecond() {
        return second;
    }
    
    /**
     * Advances the time by one second
     * @return this Time object for method chaining
     */
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    
    /**
     * Rolls back the time by one second
     * @return this Time object for method chaining
     */
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
    
    /**
     * Returns the time in the format "HH:MM:SS"
     * @return the formatted time string
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
