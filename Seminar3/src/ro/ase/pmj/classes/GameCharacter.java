package ro.ase.pmj.classes;

import java.util.Arrays;

public class GameCharacter  extends Entity {

    int healthPoint;
    String name;
    boolean hasWeapon;
    int[] costs;

    public GameCharacter(){

    }


    public GameCharacter(int healthPoint, String name, boolean hasWeapon,int[] costs,int id) {
        super(id);//din entity
        this.healthPoint = healthPoint;
        this.name = name;
        this.hasWeapon = hasWeapon;
        this.costs = costs;

        if(costs !=null){

            this.costs = new int[costs.length];

            for(int i = 0;i<costs.length;i++){

                this.costs[i] = costs[i];
            }
        }
    }

    public GameCharacter(int healthPoint, String name, boolean hasWeapon, int[] costs) {

    }

    public void setCosts(int[] costs) {
        if(costs !=null){

            this.costs = new int[costs.length];

            for(int i = 0;i<costs.length;i++){

                this.costs[i] = costs[i];
            }
        }
    }
    public int[] getCosts() {

        int[] newCost = new int[costs.length];
        System.arraycopy(this.costs,0,newCost,0,this.costs.length);
        return newCost;
    }

    @Override
    public String toString() {//metoda mestenita din object
        String display = "Name is: " + this.name + " HP: " + this.healthPoint;
        return display;
    }
    public void something(){

    }

    @Override
    public void die() {
        System.out.println("Character died!");
    }
}
