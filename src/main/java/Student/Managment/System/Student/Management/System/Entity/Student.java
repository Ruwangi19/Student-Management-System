package Student.Managment.System.Student.Management.System.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "first name", nullable = false)
    private String firstName;
    @Column (name = "last name", nullable = false)
    private String lastName;
    @Column ( name = "email" ,nullable = false)
    private String email;
    @Column (name = "department", nullable = false)
    private String department;
    @Column ( name = "yearOfEnrollment" ,nullable = false)
    private int yearOfEnrollment;
}
