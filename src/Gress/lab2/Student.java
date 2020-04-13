package Gress.lab2;

import java.util.Comparator;

public class Student {
    String surname;
    int age;
    double hight;

    public Student(String surname, int age, double hight) {
        this.surname = surname;
        this.age = age;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                '}';
    }

    public static Comparator<Student> StudentSurnameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.surname.compareTo(o2.surname);
        }
    };

    public static Comparator<Student> StudentAgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };
    public static Comparator<Student> StudentHightComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.hight,o2.hight);
        }
    };
}
