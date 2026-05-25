/* Write a program that asks the user how far they ran (in miles)
 * and then how long it took them (in minutes), and print out
 * their speed in miles per hour. */
function start(){
    var totalDistanceCovered = readFloat("Total distance covered? ");
    var totalTimeTaken = readInt("Total time taken? ");
    var minutesInHour = totalTimeTaken / 60;
    var speed = totalDistanceCovered / minutesInHour;
   
    println("The speed you reached: " + speed );
	
}