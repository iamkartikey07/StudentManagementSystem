public class Subject {
    private String subjectCode;
    private String subjectName;
    private String teacherAssigned;
    public Subject( String subjectCode, String subjectName , String teacherAssigned) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.teacherAssigned = teacherAssigned;
    }
    public String getSubjectCode(){
        return subjectCode;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public String getTeacherAssigned(){
        return teacherAssigned;
    }
}
