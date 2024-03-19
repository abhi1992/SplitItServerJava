package com.purpleteaches.splitit2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.List;

@Entity(name="groups")
@Getter
@Setter
@SQLRestriction("deleted = False")
@SQLDelete(sql = "UPDATE groups SET deleted = TRUE WHERE id = ?", table = "groups")
public class Group extends BaseModel {
    private String name;
    private String description;
    @ManyToMany
    private List<User> members;
    @OneToMany(mappedBy = "group")
    private List<User> expenses;
    @ManyToOne
    private User createdBy;
    private Boolean deleted = Boolean.FALSE;
}
