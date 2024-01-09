package clasesparaninfo.user;

import java.time.LocalDateTime;

/**
 * The type User.
 */
public class User {
    /**
     * The Username.
     */
    public String username;
    /**
     * The Password.
     */
    public String password;
    /**
     * The Email.
     */
    public String email;
    /**
     * The CreateAt.
     */
    public LocalDateTime createAt;
    /**
     * The Last login.
     */
    public LocalDateTime lastLogin;
    /**
     * The Enabled.
     */
    public boolean enabled;

    /**
     * Instantiates a new User.
     *
     * @param username the username
     * @param password the password
     * @param email    the email
     * @param enabled  the enabled
     */
    public User(String username, String password, String email, boolean enabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        createAt = LocalDateTime.now();
    }

    /**
     * Instantiates a new User.
     *
     * @param username the username
     * @param password the password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = null;
        this.enabled = true;
        createAt = LocalDateTime.now();
    }

    /**
     * Instantiates a new User.
     *
     * @param username the username
     */
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
