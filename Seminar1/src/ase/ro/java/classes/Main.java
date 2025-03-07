package ase.ro.java.classes;

public class Main {
    //main => genereaza toata clasa main
    //packages system.out.
    //system clasa default (system.out) => package
    // out metoda
    public static void main(String[] args) {

        System.out.println(args[0]);

        int x = 0;
        System.out.println("Java");
        System.out.println(x);

        //Car c = null;
        //System.out.println(c.getModel());

        Car c1 = new Car(20,"Renault");
        System.out.println(c1.getModel());
        System.out.println(c1.getClass());

        int[] dim = {100,200,300};
        Car c2 = new Car(20,"Renault",dim);

        //System.out.println(c2.getDimensions());
        //in java lucram cu JVM => ne aloca spatiu in care vom lucra

       for(int i = 0;i<c2.getDimensions().length;i++){

           System.out.println(c2.dimensions[i]);


       }
        //refereinte nu pointeri

        //daca faci c2 = c1 fara sa faci myClone
        //o sa ai ca toate referintele pointeaza catre acelasi obiect din memorie
        //-> daca il modific pe c2 se va modifica si c1 si tot asa


    }
}