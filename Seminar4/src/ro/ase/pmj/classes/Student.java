package ro.ase.pmj.classes;

import java.util.Arrays;

public class Student {
    String name;
    float[] grades = new float[10];

    public Student(String name, float[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student " +
                " name= " + name + '\'' +
                " grades= " + Arrays.toString(grades);
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return this.name == ((Student)obj).name;//facem cast la nivel de obiect
        // return this.name == ((Student)obj).name
    }
}
