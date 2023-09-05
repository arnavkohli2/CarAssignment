public class Car
{

    public final double capacity = 22;

    private double startMiles;
    private double endMiles;
    private double gallons;


    public Car(double startMiles, double endMiles, double gallons)
    {
        this.startMiles = startMiles;
        this.endMiles = endMiles;
        this.gallons = gallons;
    }

    public double calculateMPG()
    {
        return (endMiles - startMiles) / gallons;
    }

    public double milesToEmpty()
    {
        return calculateMPG() * capacity;
    }
}

