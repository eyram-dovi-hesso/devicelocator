package ch.hesso.master.devloc.repository;

import ch.hesso.master.devloc.modele.Account;
import ch.hesso.master.devloc.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAccountByName(String name);
    Account findAccountByAccountId(Long accountId);
}
