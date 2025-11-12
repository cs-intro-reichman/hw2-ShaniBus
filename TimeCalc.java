public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; // "hh:mm"
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        int totalMinutes = minutes + (hours * 60) + minutesToAdd;
        int totalHours = (totalMinutes / 60) % 24;
        totalMinutes = totalMinutes % 60;
        String newTime;
        if (totalHours < 10) {
            if(totalMinutes < 10) newTime = "0" + totalHours + ":" + "0" + totalMinutes;
            else newTime = "0" + totalHours + ":" + totalMinutes;
        }
        else {
            if (totalMinutes < 10) newTime = totalHours + ":" + "0" + totalMinutes;
            else newTime = totalHours + ":" + totalMinutes;
         } 

        System.out.println(newTime);
    }
}
