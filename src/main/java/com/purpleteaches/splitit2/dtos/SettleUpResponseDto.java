package com.purpleteaches.splitit2.dtos;

import com.purpleteaches.splitit2.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpResponseDto {
    private List<Expense> expenses;
}
