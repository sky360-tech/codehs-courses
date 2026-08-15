public class Student

{

private String firstName;

private String lastName;

private int gradeLevel;

private String school;

public Student(String fName, String lName, int grade, String theSchool)

{

firstName = fName;

lastName = lName;

gradeLevel = grade;

school = theSchool;

}

public Student(String fName, String lName, int grade)

{

firstName = fName;

lastName = lName;

gradeLevel = grade;

if (gradeLevel >= 9 && gradeLevel <= 12)

{

school = "high school";

}

else if (gradeLevel >= 6 && gradeLevel <= 8)

{

school = "middle school";

}

else

{

school = "elementary school";

}

}

public String toString()

{

return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;

}

public String getFirstName(){

return firstName;

}

}// reviewed: 2026-08-15
