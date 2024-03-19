package com.purpleteaches.splitit2.controllers;


import com.purpleteaches.splitit2.exceptions.GroupNotFoundException;
import com.purpleteaches.splitit2.models.Group;
import com.purpleteaches.splitit2.services.GroupService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GroupController {

    GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findGroupById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(groupService.findById(id)
                .orElseThrow(() -> new GroupNotFoundException(id)), HttpStatus.OK);
    }

}
