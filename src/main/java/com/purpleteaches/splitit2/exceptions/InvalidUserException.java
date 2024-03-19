package com.purpleteaches.splitit2.exceptions;

import com.purpleteaches.splitit2.models.ExpenseUser;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(Long id, String message) {
        super(message);
    }
}
