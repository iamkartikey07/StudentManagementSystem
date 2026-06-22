import java.util.List;
import java.util.ArrayList;
public class Student extends Person {
    private int rollNum;
    private String section;
    private String status;
    private boolean isFeesPaid;
    private boolean isHosteler;
    private List<Subject> subjects;

    public Student(String name , int age , String gender , String id , int rollNum , String section , boolean isHosteler) {
        super(name, age, gender, id);
        this.rollNum = rollNum;
        this.section = section;
        this.isHosteler = isHosteler;
        isFeesPaid = false;
        status = "Active";
        this.subjects = new ArrayList<>();
    }

    @Override
    public String getRole(){
        return "Student";
    }

    public String getSection() {
        return section;
    }
    public String getStatus(){
        return status;
    }
    public boolean isFeesPaid(){
        return isFeesPaid;
    }
    public boolean isHosteler(){
        return isHosteler;
    }
    public int getRollNum(){
        return rollNum;
    }
    public void markFeesPaid(){
        this.isFeesPaid = true;
    }
    public void changeSection(String newSection){
        this.section = newSection;
    }
    public void markAsAlumni(){
        this.status = "Alumni";
    }
    public void enrollSubject(Subject subject){
        this.subjects.add(subject);
    }
}
