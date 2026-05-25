function start(){
    
    var pointsPerGame = readInt("What is your point per game? ");
    var leastPoints = pointsPerGame > 10;
    var pointsToBeStar = pointsPerGame >= 25;
    var reboundsPerGame = readInt("What is your rebound per game? ");
    var leastRebounds = reboundsPerGame > 10;
    var assistsPerGame = readInt("What is your assist per game? ");
    var leastAssists = assistsPerGame > 10;
    var allStars = leastPoints || pointsToBeStar &&  leastRebounds || leastAssists >= 25;
    println("The player is all stars: " + allStars);
	
}