public class Routine

{

private double sleep;

private double hobbies;

private double school;

private double friends;

public Routine()

{

this.sleep = 0.0;

this.hobbies = 0.0;

this.school = 0.0;

this.friends = 0.0;

}

public void setSleep(double s)

{

this.sleep = s;

}

public void setHobbies(double s)

{

this.hobbies = s;

}

public void setSchool(double s)

{

this.school = s;

}

public void setFriends(double s)

{

this.friends = s;

}

public double getSchool() {

return school;

}

public double getSleep() {

return sleep;

}

public double getHobbies() {

return hobbies;

}

public double getFriends() {

return friends;

}

public void printTotal()

{

System.out.println("How You Spend Your Week");

System.out.println("At School: " + school * 7);

System.out.println("Sleeping: " + sleep * 7);

System.out.println("With friends: " + friends * 7);

System.out.println("Doing fun stuff: " + hobbies * 7);

System.out.println("You're busy " + (sleep * 7 + school * 7 + friends * 7 + hobbies * 7)+" hours a week!");

}

}