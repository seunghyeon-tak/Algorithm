package algo.implementation;

public class PGS_340213_videoPlayer {
    public static void main(String[] args) {
        // "10:00", "00:03", "00:00", "00:05", ["prev", "next"]
        System.out.println(solution("10:00", "00:03", "00:00", "00:05", new String[]{"prev", "next"}));
    }

    static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoSecond = convertToSeconds(video_len);
        int currentSecond = convertToSeconds(pos);
        int opStartSecond = convertToSeconds(op_start);
        int opEndSecond = convertToSeconds(op_end);

        currentSecond = openingSection(currentSecond, opStartSecond, opEndSecond);

        for (String command : commands) {
            if (command.equals("prev")) {
                currentSecond -= 10;
            } else if (command.equals("next")) {
                currentSecond += 10;
            }
            currentSecond = videoLenComparison(currentSecond, videoSecond);
            currentSecond = openingSection(currentSecond, opStartSecond, opEndSecond);
        }

        return returnToTime(currentSecond);
    }

    static int convertToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);

        return (minutes * 60) + seconds;
    }

    static String returnToTime(int second) {
        int minutes = second / 60;
        int seconds = second % 60;

        String min = minutes < 10 ? "0" + minutes + ":" : minutes + ":";
        String sec = seconds < 10 ? "0" + seconds : String.valueOf(seconds);

        return min + sec;
    }

    static int openingSection(int current, int start, int end) {
        if (start <= current && current < end)
            return end;

        return current;
    }

    static int videoLenComparison(int current, int video) {
        if (current < 0) return 0;
        if (current > video) return video;

        return current;
    }
}
