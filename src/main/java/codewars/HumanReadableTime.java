package codewars;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int sec = seconds - hours * 3600 - minutes * 60;
        String time = "";
        if (hours < 10) {
            time = "0" + hours;
        } else {
            time = Integer.toString(hours);
        }
        time = time + ":";
        if (minutes < 10) {
            time = time + "0" + minutes;
        } else {
            time = time + Integer.toString(minutes);
        }
        time = time + ":";
        if (sec < 10) {
            time = time + "0" + sec;
        } else {
            time = time + Integer.toString(sec);
        }
        return time;
    }

    public static String makeReadableStringFormat(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, seconds % 3600 / 60, seconds % 3600 % 60);
    }
}
