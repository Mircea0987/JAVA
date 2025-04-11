package eu.ase.ro.classes;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

public class Student extends Person implements Serializable,Cloneable {

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
        for(int i = 0;i<grades.length;i++){
            newGrades[i] = this.grades[i];
        }
        return newGrades;
    }

    public void setGrades(int[] grades) {

        if(grades != null){
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
    protected Student clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.grades = this.grades.clone();
        copy.collegeName = this.collegeName;
        return copy;

    }

    @Override
    public void collegeName() {
        System.out.println("The person " + this.name + " is student of: " + this.collegeName);
    }
    public void serialize(){
        try {
            FileOutputStream fos = new FileOutputStream("student.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Student deserialize(){
        FileInputStream fis = null;
        Student s = null;
        try {
            fis = new FileInputStream("student.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s = (Student) ois.readObject();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return s;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("grades=").append(Arrays.toString(grades));
        sb.append(", collegeName='").append(collegeName).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
