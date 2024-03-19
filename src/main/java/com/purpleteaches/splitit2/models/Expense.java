package com.purpleteaches.splitit2.models;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

import java.util.ArrayList;

@Getter
@Setter
@SQLRestriction("deleted = False")
public class Expense {
    ArrayList<User> users;
    int amount;
    String currencyType;
    String name;
    ArrayList<Double> splits;
    int paidByUserId;
    @ManyToOne
    private User createdBy;
    private Boolean deleted = Boolean.FALSE;
}
