package com.github.nishadnijam.springwebfluxtaskorganizerapi.model.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TaskOrganizerGenericException {

    private final String errorMessage;
}
