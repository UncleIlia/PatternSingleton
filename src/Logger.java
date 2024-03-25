import java.util.Date;

public class Logger {
    protected int num = 1;

    public static Logger instance = null;

    private Logger() {
    }

    public void log(String msg) {
        Date date = new Date();
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
