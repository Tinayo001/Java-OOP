public class LogLevels {
    
    public static String message(String logLine) {
        String[] parts = logLine.split(":", 2);

        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":", 2);
        return parts[0].substring(1, parts[0].length() - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] parts = logLine.split(":", 2);

        String message = parts[1].trim();
        String level = parts[0].substring(1,            parts[0].length() - 1).toLowerCase();

        return message + " (" + level + ")";
}

}
