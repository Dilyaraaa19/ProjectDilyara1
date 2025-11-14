abstract class Person {
    private String name;

    protected Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Student extends Person{
    private int groupId;

    public Student(String name, int groupId){
        super(name);
        this.groupId = groupId;
    }
}

class Teacher extends Person{
    private int courseId;

    public Teacher(String name, int courseId){
        super(name);
        this.courseId= courseId;
    }
}

class Class{
    public static void main(String[] args){
        Person Mary = new Student("Mary",741-91);
        Person Clara = new Teacher("Clara",3);
    }
}