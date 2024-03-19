package com.purpleteaches.splitit2.services;

import com.purpleteaches.splitit2.models.Expense;
import com.purpleteaches.splitit2.models.ExpenseUser;
import com.purpleteaches.splitit2.repositories.ExpenseUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseUserRepository expenseUserRepository;

    public ExpenseService(ExpenseUserRepository expenseUserRepository) {
        this.expenseUserRepository = expenseUserRepository;
    }

    public void addExpense(ExpenseUser expense) {
        expenseUserRepository.save(expense);
    }
}
