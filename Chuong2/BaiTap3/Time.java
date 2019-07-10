/**
 * Time
 */
public class Time {
    public static void main(String[] args) {
        /*
        int hour = 18;
        int minute = 42;
        int second = 30;

        int timeInAllDay = 24 * 3600;

        int timeSinceMidnightInSeconds = hour * 3600 + minute * 60 + second;
        System.out.println("Cau 3: " + timeSinceMidnightInSeconds + "(s)\n");
        int timeSinceNowUntilMidnight = timeInAllDay - timeSinceMidnightInSeconds;
        System.out.println("Cau 4: " + timeSinceNowUntilMidnight +  "(s)\n");
        int percentageOfTimePassed = (timeSinceMidnightInSeconds*100)/timeInAllDay;
        System.out.println("Cau 5: " + percentageOfTimePassed + "%\n");
        */
        int timeOfDayInSeconds = 24 * 60 * 60;
   
        int hour = 18, minute = 58, second = 10;
        int timeSinceMidnightInSeconds = hour * 3600 + minute * 60 + second;
    
        int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnightInSeconds;
    
        int startHour = 18, startMinute = 45, startSecond = 36;
        int startTimeSinceMidnightInSeconds = startHour * 3600 + startMinute * 60 + startSecond; //in seconds
    
        int timeInterval = timeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;
    
        System.out.println("Time since midnight: " + timeSinceMidnightInSeconds + " seconds");
        System.out.println("Time remaining today: " + timeLeftInSeconds + " seconds"); 
        System.out.println("Percentage of day passed: " + ((double)timeSinceMidnightInSeconds / (double)(24 * 60 *60))*100 +"%");
        System.out.println("Elapsed time: " + timeInterval + " seconds");
    }
}