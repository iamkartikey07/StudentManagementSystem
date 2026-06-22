public abstract class Person{
    private String name;
    private int age;
    private String gender;
    private String id;
    public Person(String name , int age , String gender ,String id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getId(){
        return id;
    }
    public abstract String getRole();
}
