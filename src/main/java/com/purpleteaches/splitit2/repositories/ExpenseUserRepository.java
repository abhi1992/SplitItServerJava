package com.purpleteaches.splitit2.repositories;

import com.purpleteaches.splitit2.models.ExpenseUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
    List<ExpenseUser> findAllByUser(Long userId);
}
