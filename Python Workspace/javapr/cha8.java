public class cha8 {
    public static void main(String[] args) {
    int startHours=12, startMinutes=34, startSeconds=55;
    int endHours=8, endMinutes=12, endSeconds=15;
    int startTimeInSec =startHours*3600+startMinutes*60+startSeconds;
    int endTimeInSec =endHours*3600+endMinutes*60+endSeconds;
    int totalTimeDifference = startTimeInSec-endTimeInSec;
    int hours = totalTimeDifference/3600;
    int remainingSec =totalTimeDifference%3600;
    int min=remainingSec/60;
    int sec=remainingSec%60;
    System.out.printf("calculated Time Difference =%02d:%02d:%02d ",hours, min, sec);
    }
    }
    