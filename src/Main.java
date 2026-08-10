public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher("Mr. Ramesh" , 38, "Male" , "TCH20089" , "G");
        Subject s = new Subject("BAS201","Maths","Mr. Ramesh");
        t.addSubject(s);
        Section se = new Section("D","10",t);
        Student st = new Student("Parth",15,"Male","STU1197",43,"D",true);
        se.addStudent(st);
        st.enrollSubject(s);
        Result r = new Result(69,2,s);


        System.out.println(st);
        System.out.println(se);
        System.out.println(t);
        System.out.println(s);
        r.displayResult();
    }
}