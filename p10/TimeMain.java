public class TimeMain {
    public static void main(String[] args) {
        // Test the Time class with various scenarios
        System.out.println("Testing Time class:");
        
        // Test 1: Basic addition
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time(4, 5, 6);
        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();
        
        t1.addTime(t2);
        System.out.print("After adding Time 2 to Time 1: ");
        t1.displayTime();
        
        // Test 2: Time overflow (seconds > 59)
        Time t3 = new Time(10, 30, 45);
        Time t4 = new Time(0, 0, 30);
        System.out.print("\nTime 3: ");
        t3.displayTime();
        System.out.print("Time 4: ");
        t4.displayTime();
        
        t3.addTime(t4);
        System.out.print("After adding Time 4 to Time 3: ");
        t3.displayTime();
        
        // Test 3: Time overflow (minutes > 59)
        Time t5 = new Time(10, 45, 30);
        Time t6 = new Time(0, 20, 0);
        System.out.print("\nTime 5: ");
        t5.displayTime();
        System.out.print("Time 6: ");
        t6.displayTime();
        
        t5.addTime(t6);
        System.out.print("After adding Time 6 to Time 5: ");
        t5.displayTime();
        
        // Test 4: Hour overflow (hours > 23)
        Time t7 = new Time(22, 30, 0);
        Time t8 = new Time(2, 0, 0);
        System.out.print("\nTime 7: ");
        t7.displayTime();
        System.out.print("Time 8: ");
        t8.displayTime();
        
        t7.addTime(t8);
        System.out.print("After adding Time 8 to Time 7: ");
        t7.displayTime();
    }
}
