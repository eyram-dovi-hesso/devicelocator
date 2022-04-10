package ch.hesso.master.devloc.resource.dto;

import ch.hesso.master.devloc.geolocation.Location;

import java.time.LocalDateTime;

public class AssetPositionDTO {

    private Integer idAssetPosition;

    private AssetDTO Asset;

    private UserLightDTO userCreator;

    private String accountName;
    private Long accountId;

    private Location location = new Location();

    private Double latitude;

    private Double longitude;

    private LocalDateTime creationDate;

    public Integer getIdAssetPosition() {
        return idAssetPosition;
    }

    public void setIdAssetPosition(Integer idAssetPosition) {
        this.idAssetPosition = idAssetPosition;
    }

    public AssetDTO getAsset() {
        return Asset;
    }

    public void setAsset(AssetDTO asset) {
        Asset = asset;
    }

    public UserLightDTO getUserCreator() {
        return userCreator;
    }

    public void setUserCreator(UserLightDTO userCreator) {
        this.userCreator = userCreator;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
