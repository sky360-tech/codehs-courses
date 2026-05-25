public class Comet
{
    private String name;
    private int speed;
    private double tailLength;

    public Comet(String cometName, int cometSpeed, double cometTailLength)
    {
        name = cometName;
        speed = (cometSpeed < 0) ? 30 : cometSpeed;
        tailLength = cometTailLength;
    }

    public Comet(String cometName)
    {
        name = cometName;
        speed = 20;
        tailLength = 5.0;
    }

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    public int getSpeed() { return speed; }
    public void setSpeed(int newSpeed) { speed = newSpeed; }
    public double getTailLength() { return tailLength; }
    public void setTailLength(double newTailLength) { tailLength = newTailLength; }

    public String toString()
    {
        return "Comet [name = " + name + ", speed = " + speed + " km/s, tailLength = " + tailLength + " km]";
    }
}