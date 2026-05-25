function start(){
	var credits = readBoolean("How much credit do you have? ");
	var requirement = readBoolean("You met the requirements? ");
	var canBeGraduate = credits && requirement;
	println("Can be Graduate: " + canBeGraduate);
}