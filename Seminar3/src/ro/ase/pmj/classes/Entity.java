package ro.ase.pmj.classes;

public abstract class Entity {
    int id;

    Entity(){}

    Entity(int id){
        this.id = id;
    }

    public void die(){
        System.out.println("You died!");
    }


    public abstract void something();

}
