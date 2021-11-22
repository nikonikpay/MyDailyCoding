package Felines;

public class NowegianForestCat extends Felis{

    public NowegianForestCat(String name,int age,int shelterNo,int badgeNr) {
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
        return super.getName() + "\nAge :" + super.getAge() + " Is a Norwegian cat ";
    }
}
