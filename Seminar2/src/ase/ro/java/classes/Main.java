package ase.ro.java.classes;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        for(int i = 0;i< args.length;i++){

            System.out.println(args[i]);

        }
        int[] vec =  new int[] {100,200,300};
//        int[] newDim = new int[3]; sunt echivalente
//        newDim[0] = 200;
//        newDim[1] = 300;
//        newDim[2] = 400;
        Car c1 = new Car(100,"Dacia",vec);

        Car clone = (Car)c1.clone(); //facem cast la car => pt ca nu sunt de acelasi tip => facem shallow copy
        c1.model = "Renault";
        System.out.println("Car model= " + c1.model);
        System.out.println("Car model= " + clone.model);

        for(int i = 0;i<vec.length;i++){

            System.out.println("dimensions: " + c1.getDimensions()[i]);

        }

        Car newClone = new Car(c1.getSpeed(),c1.getModel(),c1.getDimensions());

        for(int i : newClone.getDimensions()){
            System.out.println("Dimensiuni " + i);
        }
        System.out.println(newClone.toString());
    }

}