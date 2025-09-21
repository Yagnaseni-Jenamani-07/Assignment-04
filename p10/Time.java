//Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize its data members. It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. Test these methods by creating a main method in another class.
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        // Validate input values
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time values. Hour: 0-23, Minute: 0-59, Second: 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
    public void addTime(Time t) {
        this.second += t.second;
        this.minute += t.minute;
        this.hour += t.hour;
        
        // Handle overflow for seconds
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }
        
        // Handle overflow for minutes
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }
        
        // Handle overflow for hours (24-hour format)
        if (this.hour >= 24) {
            this.hour = this.hour % 24;
        }
    }
}
