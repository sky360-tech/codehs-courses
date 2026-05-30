public class SpaceRunner
{
    public static void main(String[] args)
    {
        Star myStar = new Star("Sirius", 25.4);
        System.out.println(myStar);
        myStar.setName("Rigel");
        myStar.setLuminosity(120000);
        System.out.println(myStar);

        Comet newComet = new Comet("Hale-Bopp");
        System.out.println("\n" + newComet);

        Comet halley = new Comet("Halley", -50, 10.5);
        System.out.println(halley);
    }
}// reviewed: 2026-05-30
