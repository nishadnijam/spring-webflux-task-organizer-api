package com.github.nishadnijam.springwebfluxtaskorganizerapi.exceptionhandler;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.exception.TaskOrganizerGenericException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
@Slf4j
public class TaskOrganizerExceptionHandler {

    @ExceptionHandler(NotImplementedException.class)
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public Mono<TaskOrganizerGenericException> handleNotImplementedException(NotImplementedException exception) {
        return Mono.just(new TaskOrganizerGenericException(exception.getMessage()));
    }
}
