package opdracht.thirteen.two;

import javax.sound.midi.Instrument;

public class Musician {

    public void play(){
        class Instrument{

            public void makeSound(){
                System.out.println("Making noise");
            }
        }

        Instrument instrument = new Instrument();
        instrument.makeSound();
        System.out.println("Outer class play");
    }



}
