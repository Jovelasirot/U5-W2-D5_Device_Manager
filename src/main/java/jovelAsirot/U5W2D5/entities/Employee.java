package jovelAsirot.U5W2D5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private Long id;

    private String username;

    private String name;

    private String surname;

    private String email;

    private String profileImage;

    public Employee(String username, String name, String surname, String email, String profileImage) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.profileImage = profileImage;
    }

}
