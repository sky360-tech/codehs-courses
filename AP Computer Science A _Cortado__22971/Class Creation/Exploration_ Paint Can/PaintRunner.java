public class PaintRunner
{
    public static void main(String[] args)
    {
        PaintCan can = new PaintCan(5.0, "marigold");
        System.out.println("Initial paint amount: " + can.getPaintAmount());

        double amountNeeded = 3.5;
        if (can.canPaint(amountNeeded))
        {
            can.usePaint(amountNeeded);
            System.out.println("Paint used. Remaining amount: " + can.getPaintAmount());
        }
        else
        {
            System.out.println("Not enough paint.");
        }

        // Test setColor and getColor
        can.setColor("aqua");
        System.out.println("Color: " + can.getColor());

        // Test getCoverage
        System.out.println("Coverage: " + can.getCoverage() + " sq ft");
    }
}// reviewed: 2026-05-31
