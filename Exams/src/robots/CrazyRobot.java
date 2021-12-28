package robots;

public class CrazyRobot extends Robot
    {
    public CrazyRobot()
        {
        this("I am a crazy Robot");
        }

    public CrazyRobot(String unitName)
        {
        super(unitName);
        }

    @Override
    public void boot()
        {
        String crazyRobotName = getUnitName();
        StringBuilder fromCrazyRobotName = new StringBuilder(crazyRobotName);
        fromCrazyRobotName.reverse();
        String reversedName = fromCrazyRobotName.toString();
        setUnitName(reversedName);
        super.boot();
        }

    @Override
    public String toString()
        {
        return "CrazyRobot{" +
                "unitName='" + super.toString() + '\'' +
                '}';
        }
    }
