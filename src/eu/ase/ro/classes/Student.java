package eu.ase.ro.classes;

import java.io.Console;
import java.sql.Array;
import java.util.Arrays;

public class Student extends  Person {

    int[] grades;
    String collegeName;


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

    public int[] getGrades() {

        int[] newGrades = new int[this.grades.length];
        System.arraycopy(this.grades,0,newGrades,0,this.grades.length);
        return  newGrades;
    }

    public void setGrades(int[] grades) {

        if(grades !=null) {
            this.grades = new int[grades.length];
            for(int i = 0;i<grades.length;i++){
                this.grades[i] = grades[i];
            }
        }

    }

    public Student(int[] grades,int age,String name,String[] qualities,String collegeName){
        super(age,name,qualities);
        this.name = name;
        this.collegeName = collegeName;
        this.age = age;

       if(grades !=null){

           this.grades = new int[grades.length];
           for(int i = 0;i<grades.length;i++){
               this.grades[i] = grades[i];
           }

       }

    }
    public int gradesAvg(){

        int avg = 0;
        int numberOfGradesAboceAvg = 0;
        for(int i = 0;i<grades.length;i++){

            avg += this.grades[i];

        }

        avg = avg / grades.length;

        for(int i = 0;i<grades.length;i++){
            if(grades[i] > avg){
                numberOfGradesAboceAvg++;
            }
        }
        System.out.println("Numbers of grades above average is: " + numberOfGradesAboceAvg);
        return avg;

    }


    @Override
    protected Student clone(){
        Student clone = new Student(this.grades,this.age, this.name,this.qualities,this.collegeName);
        return clone;
    }

    @Override
    public void collegeName() {
        System.out.println("The person " + this.name + " is student of: " + this.collegeName);
    }
}
