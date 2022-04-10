package ch.hesso.master.devloc.repository;

import ch.hesso.master.devloc.geolocation.Location;
import ch.hesso.master.devloc.modele.Account;
import ch.hesso.master.devloc.modele.Asset;
import ch.hesso.master.devloc.modele.AssetPosition;
import ch.hesso.master.devloc.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AssetPositionRepository extends JpaRepository<AssetPosition, Long> {
    AssetPosition findAssetPositionByAsset(Asset asset);
    List<AssetPosition> findAssetPositionsByCreator(User user);
    List<AssetPosition> findAssetPositionsByCreationDateBetween(LocalDateTime begin, LocalDateTime end);
    List<AssetPosition> findAssetPositionsByAccount(Account account);
}
