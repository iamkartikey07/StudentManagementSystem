import java.util.List;
public class Teacher extends Person {
    private String classCoordinatorOf;
    private List<String> subjectsTaught;

    public Teacher(String name, int age, String gender, String id, String classCoordinatorOf, List<String> subjectsTaught) {
        super(name, age, gender, id);
        this.classCoordinatorOf = classCoordinatorOf;
        this.subjectsTaught = subjectsTaught;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    public String getClassTeacherOf() {
        return classCoordinatorOf;
    }
    public List<String> getSubjectsTaught(){
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
}