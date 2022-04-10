package ch.hesso.master.devloc.repository;

import ch.hesso.master.devloc.modele.Account;
import ch.hesso.master.devloc.modele.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    Asset findAssetByReference(String reference);
    List<Asset> findAssetsByAccount(Account account);
    List<Asset> findAssetsByName(String name);
}
