package Felines;

public class TurkishVanCat extends Felis {


    public TurkishVanCat(String name,int age,int shelterNo,int badgeNr) {
        super(name,age,shelterNo,badgeNr);

    }

    @Override
    public void makeNoise(String sound) {
        System.out.println("Turkish made noise");
    }

    @Override
    public void eat() {
        System.out.println("Turkish is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Turkish is sleeping");
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return super.getName() + "\nAge :" + super.getAge() + " Is a Turkish cat ";
    }
}
