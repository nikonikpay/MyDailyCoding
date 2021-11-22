package Felines;

public class SiameseCat extends Felis{


    public SiameseCat(String name,int age,int shelterNo,int badgeNr) {
        super(name,age,shelterNo,badgeNr);

    }

    @Override
    public void makeNoise(String sound) {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return super.getName() + "\nAge :" + super.getAge() + " Is a Siasme cat ";
    }
}
