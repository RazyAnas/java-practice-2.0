import java.time.Duration;

public class SecondMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3650));
        System.out.println(getDurationString(65,65));
    }
    //getDurationString should return duration in the format: XXh YYm ZZs
    public static String getDurationString(int seconds){
        String duration = "";
        // How to convert seconds to Hours? just divide second by 3600
        // How we will get minutes out of this?: divide the 1st' remainder by 60
        // How to get remaining seconds?: Remainder thats left from minutes wala logic is the seconds
        if (seconds>=0){

            int hours = seconds/3600;
            int minutes = (seconds%3600)/60;
            int secondsLeft = (seconds%3600)%60;

            duration = hours+"h "+ minutes+"m "+secondsLeft+"s";

            return duration;
        } else {
            duration = "undefined";
            return duration;
        }
    }
    public static String getDurationString(int minutes, int seconds){
        String duration = "";
        if (minutes>=0 && seconds>=0 && seconds<=59){
            seconds = minutes*60+seconds;
            int hours = seconds/3600;
            int minutesLeft = (seconds%3600)/60;
            int secondsLeft = (seconds%3600)%60;
            duration = hours+"h "+ minutesLeft+"m "+secondsLeft+"s";
            return duration;
        } else {
            duration = "undefined or wrong input nigger...";
            return duration;
        }

    }
}
