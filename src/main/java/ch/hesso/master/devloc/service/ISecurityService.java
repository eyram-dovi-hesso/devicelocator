package ch.hesso.master.devloc.service;

public interface ISecurityService {
    public boolean isAuthenticated();
    public void autoLogin(String username, String password);
}
