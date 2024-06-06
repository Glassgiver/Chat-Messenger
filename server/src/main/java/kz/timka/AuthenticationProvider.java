package kz.timka;

public interface AuthenticationProvider {
    String getUsernameByLoginAndPassword(String login, String password);

    boolean changeUsername(String newUsername, String oldUsername);
}
