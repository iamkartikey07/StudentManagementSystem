public class Result {
    private int marks;
    private int semester;
    private Subject subjects;


    public Result(int marks , int semester , Subject subjects){
        this.marks = marks;
        this.semester = semester;
        this.subjects = subjects;
    }

    public int getMarks(){
        return marks;
    }
    public int getSemester(){
        return semester;
    }
    public String getSubjects(){
        return subjects.getSubjectName();
    }
    public void displayResult(){
        System.out.println(marks + "," + semester + "," + subjects.getSubjectCode() + "," + subjects.getSubjectName());
    }
}