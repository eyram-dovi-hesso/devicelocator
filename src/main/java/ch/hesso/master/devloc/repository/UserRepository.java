package ch.hesso.master.devloc.repository;

import ch.hesso.master.devloc.modele.Account;
import ch.hesso.master.devloc.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    List<User> findUsersByAccount(Account account);
}
