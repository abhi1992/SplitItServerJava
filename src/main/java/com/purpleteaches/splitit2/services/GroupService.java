package com.purpleteaches.splitit2.services;

import com.purpleteaches.splitit2.models.Expense;
import com.purpleteaches.splitit2.models.Group;
import com.purpleteaches.splitit2.models.User;
import com.purpleteaches.splitit2.repositories.GroupRepository;
import com.purpleteaches.splitit2.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {

    private final GroupRepository groupRepository;
    private final UserRepository userRepository;
    public GroupService(GroupRepository groupRepository, UserRepository userRepository) {

        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public Optional<Group> findById(Long id) {
        return groupRepository.findById(id);
    }

    public void delete(Long id) {
        groupRepository.deleteById(id);
    }

    public List<Group> findByUserId(Long id) {
        return userRepository.findById(id).orElseThrow().getGroups();
    }
}
