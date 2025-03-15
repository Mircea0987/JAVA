package eu.ase.ro.classes;

public abstract class Person {

    int age;
    String name;
    String[] qualities;


    public Person(int age, String name, String[] qualities) {
        this.age = age;
        this.name = name;

        if(qualities !=null){
            this.qualities = new String[qualities.length];

            for(int i = 0;i<qualities.length;i++){
                this.qualities[i] = qualities[i];
            }
        }
    }
    public void die(){
        System.out.println("The person " + this.name + " has died!");
    }
    public abstract void collegeName();


}
