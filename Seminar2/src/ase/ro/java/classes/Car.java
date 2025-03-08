package ase.ro.java.classes;

//private
//protected
//public
//package doar claselor care se afla in package cu ea (si cele care mostenesc dar si cele care nu)
//super() => apeleaza constructorul mostenit (apeleaza constructorul din clasa de baza)
//ca in ce c# totul pleaca de la clasa Object

import java.lang.reflect.Array;
import java.util.Arrays;

//packages e default daca nu pun
public class Car extends Object {//extends Object

    int speed;
    String model;
    int[] dimensions;

    public Car(int speed, String model) {

        this.speed = speed;
        this.model = model;
    }

    public Car(int speed, String model, int[] dimensions) {
        this.speed = speed;
        this.model = model;
        //this.dimensions = dimensions; se face shallow copy
        //=> facem un vector si nou
        if(dimensions !=null){
            this.dimensions = new int[dimensions.length];

            for(int i =0;i<dimensions.length;i++){

                this.dimensions[i] = dimensions[i];
            }
        }

    }

    public Car(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int[] getDimensions() {
        int[] clone = new int[this.dimensions.length];
        System.arraycopy(this.dimensions, 0,clone,0,this.dimensions.length);
        return clone;
        //echivalent cu for-ul din constructorul de copiere
    }
    //suprascirem metode din clasa obiect

    //hash => cauta dupa ceva
    //exemplu cafea => caut dupa caf => daca utilizatorul baga caf => returnam cafea etc (nivel simplistic)
    // sa fie unice
    //equals => compara 2 obiecye => true daca sunt egale
    //clone => echivalent cosntructor de copiere
    //to_string => returneaza string

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone(){

        Car clone = new Car(this.speed,this.model,this.dimensions); //facem deep copy
        return clone;

    }

    @Override
    public String toString() {

         return "Modelul " + this.model + " are viteaza " +this.speed + " dimensiune " + " " +Arrays.toString(dimensions);
    }
}
