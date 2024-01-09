package paquete;

import java.time.LocalDateTime;

public class User {
    public String username;
    public String password;
    public String email;
    public LocalDateTime createAt;
    public LocalDateTime lastLogin;
    public boolean enabled;

    public User(String username, String password, String email, boolean enabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        createAt = LocalDateTime.now();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = null;
        this.enabled = true;
        createAt = LocalDateTime.now();
    }

    public User(String username) {
        this.username = username;
        this.password = null;
        this.email = null;
        this.enabled = true;
        createAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createAt=" + createAt +
                ", lastLogin=" + lastLogin +
                ", enabled=" + enabled +
                '}';
    }
}
