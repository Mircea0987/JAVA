package ro.ase.pmj.classes;
//extends echivalent : in c++
//ca in c# nu exista derivare multipla
//implements => intefata
public class Warrior extends GameCharacter implements IAttackable{

//nu avem constructorul fara parametri => eroare daca incercam sa apelam aici fara sa dam super() cu parametri

    boolean weapon;
    Weapon w; //compozitie has a

    public Warrior(int healthPoint, String name, boolean hasWeapon, int[] costs,String weaponName) {
        super(healthPoint,name,hasWeapon,costs);
        this.w = new Weapon(weaponName);
    }

    @Override //suprascriere metoda din baza (GameCharacter)

    public String toString() {//din clasa GameCharacter
        return "and my weapon is: " + this.w.name;
    }
    public void attack(){
        System.out.println("attack");
    }

    @Override
    public void die() {
        System.out.println("Warrior died!");
    }
}

