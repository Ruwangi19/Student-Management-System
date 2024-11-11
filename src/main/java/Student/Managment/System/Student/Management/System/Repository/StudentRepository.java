package Student.Managment.System.Student.Management.System.Repository;
import Student.Managment.System.Student.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,long>{
    
    //crud
    List<Student> findByyearOfEnrollment(int yearOfEnrollment);

    //Custom query to get the department name and student Id
    @Query("SELECT s.department.name FROM Student s WHERE s.id = :studentId")
    String findDepatementNameByStudentId(@Param("studentId") long studentId)

    //Custom mwthod to delete students by year of enrollment
    void deleteByYearOfEnrollment(int yearOfEnrollment);
}
