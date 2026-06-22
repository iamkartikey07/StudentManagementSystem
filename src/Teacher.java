import java.util.List;
import java.util.ArrayList;
public class Teacher extends Person {
    private String classCoordinatorOf;
    private List<Subject> subjectsTaught;

    public Teacher(String name, int age, String gender, String id, String classCoordinatorOf) {
        super(name, age, gender, id);
        this.classCoordinatorOf = classCoordinatorOf;
        this.subjectsTaught = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    public String getClassTeacherOf() {
        return classCoordinatorOf;
    }
    public List<Subject> getSubjectsTaught(){
        return subjectsTaught;
    }
    public void assignSection(String newSection){
        this.classCoordinatorOf = newSection;
    }
    public String viewStudents(){
        return "Viewing students of" + classCoordinatorOf;
    }
    public String submitMarks(){
        return "Marks Submitted";
    }
    public void addSubject(Subject subject) {
        this.subjectsTaught.add(subject);
    }
}