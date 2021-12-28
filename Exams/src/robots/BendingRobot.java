package robots;

public class BendingRobot extends Robot
    {
    private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName)
        {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
        }

    public void bend(double angle)
        {

        if (angle % 360 <= maxBendAngle)
            System.out.println("Your robot bend "+ angle%360 + " degree successfully");
        else
            {
            System.out.println("Robot Could Not Bend");
            }
        }

    @Override
    public String toString()
        {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                ", unitName='" + super.toString() + '\'' +
                '}';
        }
    }
