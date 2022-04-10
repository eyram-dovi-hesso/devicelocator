package ch.hesso.master.devloc.service;

import ch.hesso.master.devloc.modele.User;

public interface IUserService {
    public User save(User user);
    public User findByUsername(String username);
}
