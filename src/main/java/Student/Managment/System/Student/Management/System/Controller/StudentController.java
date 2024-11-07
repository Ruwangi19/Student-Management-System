package Student.Managment.System.Student.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Student.Managment.System.Student.Management.System.Entity.Student;
import Student.Managment.System.Student.Management.System.Service.StudentService;

@RestController
@RequestMapping("/api/Students")
@CrossOrigin(origins = "*")

//crud
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student),HttpStatus.CREATED);
    }

    //GetAll Rest Api
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //Get by Id Rest Api
    @GetMapping("{id}")

    //localHost:8080/api/student/1
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId){
        return new ResponseEntity<Student>(studentService.getStudentById(studentId),HttpStatus.OK);
    }

    //Update Rest Api
    public ResponseEntity<Student> updateEmployee(@PathVariable("id") long id,
    @RequestBody Student student){
        return new ResponseEntity<Student>(studentService.updateStudent(student,id),HttpStatus.OK);
    }
    //Delete Rest Api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
    //delete employee from db
        studentService.deleteStudent(id);
        return new ResponseEntity<String>("Student deleted Successfully.",HttpStatus.OK);
    }   
}
