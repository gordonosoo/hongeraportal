package ke.co.safaricom.hongeraportal.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user" )

public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String title;
    private String first_name;
    private String last_name;
    private String emailAddress;
    private Long departmentId;
    private String password;
    private String dateOfEmployment;

}

