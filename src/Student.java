import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;
    Student(int rollNo,String name,int age)
    {
        this.rollNo = rollNo;
        this.name=name;
        this.age=age;
    }

    public void printStudent()
    {
        System.out.println("Student Roll number is: "+this.rollNo);
        System.out.println("Student Name is: "+this.name);
        System.out.println("Student Age is: "+this.age);
    }
    public static void main(String [] args)
    {
        Student student1 = new Student(1,"Pardeep",29);
        Student student2 = new Student(2,"Sumit",30);
        student1.printStudent();
        student2.printStudent();

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        Collections.sort(studentList);
        for (Student student:studentList)
        {
            System.out.println(student.age+ " "+ student.name+" " + student.rollNo);
        }
    }

    public int compareTo(Student student) {
       if(this.age==student.age)
           return 0;
       else if(age< student.age)
           return 1;
       else
           return -1;
    }
}
