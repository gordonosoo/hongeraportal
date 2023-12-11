package ke.co.safaricom.hongeraportal.user;

public class User {
    private Long id;
    private String username;
    private String email;
    private String department ;

    public User() {
    }

    public User(Long id,
                String username,
                String email,
                String department) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.department = department;
    }

    public User(String username,
                String email,
                String department) {
        this.username = username;
        this.email = email;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
