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

    // Add Getters and setters in the student.java

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment){
        this.yearOfEnrollment = yearOfEnrollment;
    }
}
