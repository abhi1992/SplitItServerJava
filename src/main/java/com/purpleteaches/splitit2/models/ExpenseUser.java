package com.purpleteaches.splitit2.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

public class ExpenseUser extends BaseModel {
    @ManyToOne
    private Expense expenses;
    @ManyToOne
    private User user;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private ExpenseUserType expenseUserType;
}
