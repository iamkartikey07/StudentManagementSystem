import java.util.ArrayList;
import java.util.List;

public class Section {
    private String identifier;
    private String grade;
    private Teacher classTeacher;
    private List<Student> students;


    public Section(String identifier , String grade , Teacher classTeacher){
        this.identifier = identifier;
        this.grade = grade;
        this.classTeacher = classTeacher;
        this.students = new ArrayList<>();
    }
    public String getIdentifier(){
        return identifier;
    }
    public String getGrade(){
        return grade;
    }
    public Teacher getClassTeacher(){
        return classTeacher;
    }
    public List<Student> getStudents() {
        return students;
    }


    public void assignClassTeacher(Teacher newTeacher){
        classTeacher = newTeacher;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}