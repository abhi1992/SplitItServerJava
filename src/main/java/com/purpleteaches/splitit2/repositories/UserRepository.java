package com.purpleteaches.splitit2.repositories;

import com.purpleteaches.splitit2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);

    Optional<User> registerUser(User user);

    @Override
    void delete(User entity);
}
