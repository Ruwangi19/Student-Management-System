package Student.Managment.System.Student.Management.System.Service;
import Student.Managment.System.Student.Management.System.Entity.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Student student,long id);
    void deleteStudent (long id);
}
