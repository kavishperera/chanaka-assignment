package lk.kavishmanjitha.machine_issues_traking.v1.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class EntityNotFoundException extends SystemException {

    public EntityNotFoundException(String message) {
        super(message);
    }

}
