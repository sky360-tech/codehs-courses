public class CarTester {


public static void main(String[] args) {

//Create a car that gets 20 mpg and has a 15 gallon tank

//Fill up the gas tank

//Check the miles available


//Drive 100 miles


//Check the miles available


//Add 2 gallons to the gas tank


//Check the miles available

//Try driving more miles than available by driving 1000 miles


//Drive 200 miles


//Check how much gas you have left


//Print total miles driven

Car minivan = new Car(20.0, 15.0);

//Fill up the gas tank

minivan.addGas();

//Check the miles available

System.out.println("Miles available: " + minivan.milesAvailable());

//Drive 100 miles

minivan.drive(100.0);

//Check the miles available

System.out.println("Miles available: " + minivan.milesAvailable());

//Add 2 gallons to the gas tank

minivan.addGas(2.0);

//Check the miles available

System.out.println("Miles available: " + minivan.milesAvailable());

//Try driving more miles than available by driving 1000 miles

minivan.drive(1000.0);

//Drive 200 miles

minivan.drive(200.0);

//Check how much gas you have left

System.out.println("Gas remaining: " + minivan.getGas());

//Print total miles driven

System.out.println("Total Miles Driven: " + minivan.getTotalMilesDriven());

}

}// reviewed: 2026-08-10
