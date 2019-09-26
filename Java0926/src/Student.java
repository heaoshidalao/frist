class Person{
    public String name;
    public int age;
    public String sex;
    public int ID;
    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age, String sex, int ID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ID;
    }
}
public class Student {
    public static void main(String [] args){
        Person person =new Person("康佳哇",25,"男",12324);
        Person person2 =new Person(25);
        Person person3 =new Person("小花");

    }

}


