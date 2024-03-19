package com.purpleteaches.splitit2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
@SQLRestriction("deleted = False")
public class User extends BaseModel {
    private String email;
    private String password;
    private String name;
    private String nickname;
    private Boolean deleted = Boolean.FALSE;
    @ManyToMany
    private List<Group> groups;
}
