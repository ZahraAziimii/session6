package number3exption;

public class GradeOutOfRange extends Exception {
    public GradeOutOfRange() {
    }

    public GradeOutOfRange(String message) {
        super("this is GeateOutOfRange" + message);
    }

    public GradeOutOfRange(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeOutOfRange(Throwable cause) {
        super(cause);
    }

    public GradeOutOfRange(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
