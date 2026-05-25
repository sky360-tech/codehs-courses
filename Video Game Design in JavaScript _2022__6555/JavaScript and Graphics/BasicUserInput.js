/* This program prompts the user for their name
 * and age, and then prints it back out. */
function start(){
	var name = readLine("Name? ");
	println("Name is: " + name);
	
	var age = readInt("Age? ");
	println("Age is: " + age);
}