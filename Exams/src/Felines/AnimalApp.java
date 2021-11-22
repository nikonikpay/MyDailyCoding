package Felines;

public class AnimalApp {

    public static void main(String[] args) {


        TurkishVanCat newcat = new TurkishVanCat("Hasan", 10, 20,362);
        TurkishVanCat myCat = new TurkishVanCat("jafar", 22, 21,363);
        PersianCat persianCat = new PersianCat("Niko", 2, 658, 65);
        SiameseCat siameseCat = new SiameseCat("Siasme", 62,26,31);
        NowegianForestCat nowegianForestCat = new NowegianForestCat("Norway cat", 5,68,94);
        AndeanMountainCat andeanMountainCat = new AndeanMountainCat("Andean", 0,12,13);
        AndeanMountainCat andeanMountainCat2 = new AndeanMountainCat("Andean2", 0,65,984);
        PersianCat newPersianCat = new PersianCat("Niko", 25, 20, 362);

        Felis[] myAnimal = new Felis[7];
        myAnimal[0] = newcat;
        myAnimal[1] = myCat;
        myAnimal[2] = persianCat;
        myAnimal[3] = siameseCat;
        myAnimal[4] = nowegianForestCat;
        myAnimal[5] = andeanMountainCat;
        myAnimal[6] = andeanMountainCat2;


        int i = 1;
        for (Felis myAni : myAnimal
        ) {
            System.out.println(i + "-" + myAni.toString());
            System.out.println("-badge number of  :" + myAni.getName() + " Is " + myAni.getBadgeNo());
            System.out.println("-Shelter number of :" + myAni.getName() + " Is" + myAni.getShelterNo());
            System.out.println(myAni.hashCode());
            i++;
        }
        System.out.println("The number of vaccination is " + Felis.getNoOfVaccinatedCats());
        System.out.println("The number of Animals is " + Animal.getAnimalCount());

        System.out.println(persianCat.equals(newcat));
        System.out.println(newcat.equals(newPersianCat));


    }
}
