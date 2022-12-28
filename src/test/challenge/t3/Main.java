package test.challenge.t3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * @author changzer
 * @date 2022/12/18
 * @apiNote
 */

class Student{
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  id+":" + name + ":" + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> set = new HashSet<Student>();
        for (int i = 0; i < 4; i++){
            String id = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            Student student = new Student(id,name,age);
            set.add(student);
        }
        for (Student student : set){
            System.out.println(student.toString());
        }
    }
}
