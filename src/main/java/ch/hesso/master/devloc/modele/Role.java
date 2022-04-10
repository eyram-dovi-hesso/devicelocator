package ch.hesso.master.devloc.modele;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleId;

    private String name;

    @Transient
    private RoleEnum roleEnum;
//
//    @ManyToMany
//    private Set<User> users;

    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    public Role(RoleEnum roleEnum) {
        this.name = roleEnum.getCode();
        this.roleEnum = roleEnum;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name != null && !name.trim().isEmpty()) {
            this.roleEnum = RoleEnum.valueOf(name);
        }
    }

//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
}