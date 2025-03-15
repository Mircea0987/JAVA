package ro.ase.pmj.classes;

public class Main {
    public static void main(String[] args) {

        int[] vector = new int[]{1,2,3};//{1,2,3}
        int[] v2 = {3,4,5};
        GameCharacter c1 = new GameCharacter(100,"John",true,vector,4);
       c1.die();

        System.out.println(c1);

        Warrior w1 = new Warrior(100,"John",true,vector,"Palos");
        w1.die();


    }

}
//saptamana 6 7 test
//in java referintele se comporta ca si pointerii