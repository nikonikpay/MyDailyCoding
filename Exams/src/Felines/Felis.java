package Felines;

import java.util.Objects;

public abstract class Felis extends Animal {

    private static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {
        if (isAlive()) {
            vaccinationCount++;

        }
    }

    public Felis() {
    };

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        super();
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);

    }




    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setShelterNo(int shelterNr) {
        if (shelterNr > 0 && shelterNr < 999) {

            this.shelterNo = shelterNr;
            return;
        }
        System.out.println(" Can not set "+ shelterNr+" To Shelter number of "+ getName());
    }

    public void setBadgeNo(int badgeNr) {
        if (badgeNr > 0 && badgeNr < 999) {

            this.badgeNo = badgeNr;
            return;

        }
        System.out.println(" Can not set " + badgeNr + " To badge number of "+ getName());

    }

    public void miauw() {

        makeNoise("I make nice noise");
    }

    public void miauw(int times) {


    }


    public static int getNoOfVaccinatedCats() {

        return vaccinationCount;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null){
            return false;
        }
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getShelterNo(), getBadgeNo());
    }
}
