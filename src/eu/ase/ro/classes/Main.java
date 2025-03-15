package eu.ase.ro.classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] grades = new int[]{7,5,3};
        int[] grades2 = new int[]{10,6,5,10,10,10};
        int[] grades3 = new int[]{1,2,3};
        String[] qualities = {"Good","Nice"};

        Student s1 = new Student(grades2,20,"John",qualities,"ASE");

        s1.die();
        s1.collegeName();
        s1.gradesAvg();



    }
}