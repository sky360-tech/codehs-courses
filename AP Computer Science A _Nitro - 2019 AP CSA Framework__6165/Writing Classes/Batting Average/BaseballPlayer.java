public class BaseballPlayer
{
private int hits;
private int atBats;
private String name;

//Add constructor here
public BaseballPlayer(String theName, int numHits, int bats)
{
name = theName;
hits = numHits;
atBats = bats;
}

public void printBattingAverage()
{
double battingAverage = hits / (double) atBats;
System.out.println(battingAverage);
}

public String toString()
{
return name + ": " + hits + "/" + atBats;
}


}