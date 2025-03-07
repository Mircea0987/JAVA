package ase.ro.java.classes;

//private
//protected
//public
//package doar claselor care se afla in package cu ea (si cele care mostenesc dar si cele care nu)
//super() => apeleaza constructorul mostenit (apeleaza constructorul din clasa de baza)
//ca in ce c# totul pleaca de la clasa Object

public class Car  {//extends Object

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
        this.dimensions = dimensions;
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
        return dimensions;
    }
    //suprascirem metode din clasa obiect

}
