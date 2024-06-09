package pro.sky.JavaSkyPro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LimitOfQuestionsException extends RuntimeException {
    public LimitOfQuestionsException(String message) {
        super(message);
    }
}