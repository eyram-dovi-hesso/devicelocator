package ch.hesso.master.devloc.modele;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;

    private String name;
    private String displayName;
    private String description;
    private LocalDateTime creationDate;
    private boolean active;
    private LocalDateTime activeInactiveDate;

//    @OneToMany
//    private Set<User> users;
//
//    @OneToMany
//    private Set<Asset> assets;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getActiveInactiveDate() {
        return activeInactiveDate;
    }

    public void setActiveInactiveDate(LocalDateTime activeInactiveDate) {
        this.activeInactiveDate = activeInactiveDate;
    }

//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//    public Set<Asset> getAssets() {
//        return assets;
//    }
//
//    public void setAssets(Set<Asset> assets) {
//        this.assets = assets;
//    }

}