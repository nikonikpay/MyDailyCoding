package animalshelter;

public class Monkey extends Animal
    {
    private boolean isHyperActive;

    public Monkey()
        {
        this.isHyperActive = false;
        }


    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive)
        {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
        }

    @Override
    public void treatAnimal()
        {
        setClean(true);
        isHyperActive = false;

        }


    @Override
    public void vaccinateAnimal(Disease disease)
        {


        }

    @Override
    public String toString()
        {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                "} " + super.toString();
        }
    }
