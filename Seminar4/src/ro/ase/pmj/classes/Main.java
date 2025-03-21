package ro.ase.pmj.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        v[0] = 0;
        v[1] = 1;
        Student[] s = new Student[2];
        Employee[] e = new Employee[2];
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John",new float[]{10,9,1}));
        studentList.add(new Student("John",new float[]{10,9,1}));
        studentList.add(1,new Student("John17",new float[]{10,9,1}));



        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));
        ArrayList studentList2 = new ArrayList();
        studentList2.addAll(studentList);
        System.out.println(new Student("John",new float[]{10,9,1}));
        //equals echivalent cu operatorul == supraincarcat

        System.out.println(studentList.indexOf(new Student("John17",new float[]{10,9,1})));
        //foloseste in spate equals => trebuie sa suprascriem metoda equals
        studentList.remove(new Student("John17", new float[]{10, 9, 1}));

        studentList.remove(0);
        studentList.set(0,new Student("AltJohn", new float[]{10, 9, 1}));
        //studentList.clear();
    //
    }
}
