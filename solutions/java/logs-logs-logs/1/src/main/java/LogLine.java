public class LogLine {

    private final String line;

    public LogLine(String line) {
        this.line = line;
    }

    public LogLevel getLogLevel() {
        if (line.startsWith("[TRC]")) return LogLevel.TRACE;
        if (line.startsWith("[DBG]")) return LogLevel.DEBUG;
        if (line.startsWith("[INF]")) return LogLevel.INFO;
        if (line.startsWith("[WRN]")) return LogLevel.WARNING;
        if (line.startsWith("[ERR]")) return LogLevel.ERROR;
        if (line.startsWith("[FTL]")) return LogLevel.FATAL;
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        int encodedLevel;

        // Map each LogLevel to a number
        switch (getLogLevel()) {
            case TRACE:
                encodedLevel = 1;
                break;
            case DEBUG:
                encodedLevel = 2;
                break;
            case INFO:
                encodedLevel = 4;
                break;
            case WARNING:
                encodedLevel = 5;
                break;
            case ERROR:
                encodedLevel = 6;
                break;
            case FATAL:
                encodedLevel = 42;
                break;
            default:
                encodedLevel = 0;
                break;
        }

        // Extract message part (remove "[XXX]: " prefix)
        String message = line.substring(line.indexOf("]:") + 2).trim();

        // Return short format
        return encodedLevel + ":" + message;
    }
}



