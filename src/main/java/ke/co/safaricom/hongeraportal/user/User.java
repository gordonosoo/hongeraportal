package ke.co.safaricom.hongeraportal.user;




public class User {

    private Long id;

    private String title;
    private String first_name;
    private String last_name;
    private String emailAddress;
    private Long departmentId;
    private String password;
    private String dateOfEmployment;

    public User() {
    }

    public User(Long id,
                String title,
                String first_name,
                String last_name,
                String emailAddress,
                Long departmentId,
                String password,
                String dateOfEmployment) {
        this.id = id;
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.emailAddress = emailAddress;
        this.departmentId = departmentId;
        this.password = password;
        this.dateOfEmployment = dateOfEmployment;
    }

    public User(String title,
                String first_name,
                String last_name,
                String emailAddress,
                Long departmentId,
                String password,
                String dateOfEmployment) {
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.emailAddress = emailAddress;
        this.departmentId = departmentId;
        this.password = password;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", departmentId=" + departmentId +
                ", password='" + password + '\'' +
                ", dateOfEmployment='" + dateOfEmployment + '\'' +
                '}';
    }
}

