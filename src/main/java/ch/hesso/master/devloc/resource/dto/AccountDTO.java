package ch.hesso.master.devloc.resource.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class AccountDTO {
    private Integer accountId;
    private String name;
    private String displayName;
    private String description;
    private LocalDateTime creationDate;
    private boolean active;
    private LocalDateTime activeInactiveDate;

    private Set<AssetDTO> assets;

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

    public Set<AssetDTO> getAssets() {
        return assets;
    }

    public void setAssets(Set<AssetDTO> assets) {
        this.assets = assets;
    }
}
