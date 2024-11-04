package Student.Managment.System.Student.Management.System.Service.Impl;

import Student.Managment.System.Student.Management.System.Entity.Student;
import Student.Managment.System.Student.Management.System.Repository.StudentRepository;
import Student.Managment.System.Student.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //save student in database
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    //get all student from database
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //get student using id
    @Override
    public Student getStudentById(long id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }else{
            throw new RuntimeException();
        }
    }

    //update student
    @Override
    public Student updateStudent(Student student, long id){
        Student existingStudent = studentRepository.findById(id).orElseThrow(()-> new RuntimeException());

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setYearOfEnrollment(student.getYearOfEnrollment());

        //save
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    //delete student
    @Override
    public void deleteStudent(long id){
        //check
        studentRepository.findById(id).orElseThrow(()-> new RuntimeException());

        //delete
        studentRepository.deleteById(id);
    }


}
