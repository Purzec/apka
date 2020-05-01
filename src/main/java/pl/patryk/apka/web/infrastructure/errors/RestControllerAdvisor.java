package pl.patryk.apka.web.infrastructure.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.patryk.apka.infrastucture.EntityNotFoundException;

@RestControllerAdvice
public class RestControllerAdvisor extends ResponseEntityExceptionHandler {


    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorMessage> entityNotFound(
            EntityNotFoundException entityNotFoundException)
    {
return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(ErrorMessage.create(entityNotFoundException));
    }



}
