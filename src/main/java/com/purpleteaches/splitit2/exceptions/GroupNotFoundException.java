package com.purpleteaches.splitit2.exceptions;

public class GroupNotFoundException extends RuntimeException {

    public GroupNotFoundException(Long id) {
        super("Group Not Found");
    }
}
