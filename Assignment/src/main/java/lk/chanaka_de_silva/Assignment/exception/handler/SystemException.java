package lk.kavishmanjitha.machine_issues_traking.v1.exception.handler;

public class SystemException extends RuntimeException {

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

}

