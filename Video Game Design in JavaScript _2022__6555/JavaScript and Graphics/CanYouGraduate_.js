function start(){
    var credits = readBoolean("Do you have enough credits?" );
    var requirements = readBoolean("Did you met the requirements?");
    var canGraduate = credits && requirements;
    println("Can you graduate? :" + canGraduate);
    
	
}// reviewed: 2026-09-06
