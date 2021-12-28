package robots;

public abstract class Robot
    {

    String unitName;

    public Robot()
        {
        this("Nameless robot");
        }

    public Robot(String unitName)
        {
        this.unitName = unitName;
        boot();
        }

    public String getUnitName()
        {
        return unitName;
        }

    public void setUnitName(String unitName)
        {
        this.unitName = unitName;
        }

    public void boot()
        {
        System.out.println(unitName + " Is about to boot");

        }

    @Override
    public String toString()
        {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
        }
    }
