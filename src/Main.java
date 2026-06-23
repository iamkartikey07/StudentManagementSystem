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


        System.out.println(st.getName());
        System.out.println(st.getRollNum());
        System.out.println(st.getGender());
        System.out.println(st.getId());
        System.out.println(st.getRole());
        System.out.println(st.getSection());
        System.out.println(st.getStatus());
        System.out.println(st.isFeesPaid());
        System.out.println(st.isHosteler());
        System.out.println(se.getGrade());
        System.out.println(t.getName());
        r.displayResult();
    }
}