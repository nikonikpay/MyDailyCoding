package Felines;

public abstract class Animal {
    protected static int animalCount;
    private char size;
    private char coat;
    private String color;
    private double weight;

    {
        if (isAlive()) {
            animalCount++;
        }

    }

    public Animal(char size, char coat, String color, double weight) {
        setSize(size);
        setCoat(coat);
        setColor(color);
        setWeight(weight);
    }

    public Animal(char size, char coat, String color) {
        this(size, coat, color,50.65);
    }

    public Animal(char size, char coat) {
        this(size, coat, "Blue");

    }

    public Animal(char size) {
        this(size, 'Y');

    }

    public Animal() {
        this('B');
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public char getSize() {
        return size;
    }

    public char getCoat() {
        return coat;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setWeight(double weight) {
        this.weight = weight;


    }



    public abstract void makeNoise(String sound);

    public abstract void eat();

    public abstract void sleep();

    public abstract boolean isAlive();


}
