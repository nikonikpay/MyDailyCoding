package opdracht.thirteen.three;

public class Musician {

    public void play(){


        Instrument instrument = new Instrument(){

            @Override
            public void makeSound() {
                System.out.println("This is annonymous class");
            }
        };

        instrument.makeSound();

        System.out.println("Outer class play");
    }



}
