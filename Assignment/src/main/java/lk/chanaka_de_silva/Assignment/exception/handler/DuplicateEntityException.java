package lk.kavishmanjitha.machine_issues_traking.v1.exception.handler;

@SystemErrorResponse(4001)
public class DuplicateEntityException extends SystemException {

    public DuplicateEntityException() {
    }

    public DuplicateEntityException(String message) {
        super(message);
    }
}

