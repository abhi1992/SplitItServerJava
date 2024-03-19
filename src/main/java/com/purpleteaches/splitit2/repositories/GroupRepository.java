package com.purpleteaches.splitit2.repositories;

import com.purpleteaches.splitit2.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    Optional<Group> findByName(String name);
    void deleteById(Optional<Long> id);

    Optional<List<Group>> findByUserId(Long id);
}
