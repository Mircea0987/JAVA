package ro.ase.pmj.classes;
//interfata => metoda abstracta numai
//abstracta => si metode cu implementare; atribute + interfata
public interface IAttackable {

    public abstract void attack();
    public static final int MIN_HITPOINTS = 10;
}
//final => const
