package ch.hesso.master.devloc.modele;

import ch.hesso.master.devloc.geolocation.Location;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "assetPosition")
public class AssetPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAssetPosition;

    @OneToOne
    private Asset asset;

    @OneToOne
    private User creator;

    @OneToOne
    private Account account;

    @Transient
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

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User createUser) {
        this.creator = createUser;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if(latitude != null){
            location.setLatitude(latitude);
        }
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
        if(longitude != null){
            location.setLongitude(longitude);
        }
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
