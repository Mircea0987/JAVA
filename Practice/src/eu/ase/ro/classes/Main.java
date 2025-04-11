package eu.ase.ro.classes;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] grades = new int[]{7,5,3};
        int[] grades2 = new int[]{10,6,5,10,10,10};
        int[] grades3 = new int[]{1,2,3};
        String[] qualities = {"Good","Nice"};

        Student s1 = new Student(grades2,20,"John",qualities,"ASE");
        Student s2 = new Student(grades2,20,"John",qualities,"ASE");

        s1.die();
        s1.collegeName();
        s1.gradesAvg();

        s1.serialize();
        System.out.println(Student.deserialize().toString());


        try {
            FileOutputStream fos = new FileOutputStream("fisier.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            osw.write(321);
            osw.write(System.lineSeparator());
            osw.write("test");
            osw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fis = new FileInputStream("fisier.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            Integer number = isr.read();
            String something = String.valueOf(isr.read());

            System.out.println(number + something);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileOutputStream fos = new FileOutputStream("fisier.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(s1.getAge());
            dos.writeUTF(s1.getName());
            dos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fis = new FileInputStream("fisier.bin");
            DataInputStream dis = new DataInputStream(fis);
            int number = dis.readInt();
            String something = dis.readUTF();
            dis.close();

            System.out.println(number + something);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}