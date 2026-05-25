function start(){
    var pointsPerGame = readInt("Points per game? ");
    var reboundsPerGame = readInt("Rebounds per game? ");
    var assistsPerGame = readInt("Assists per game? ");
    var isAllStar = pointsPerGame >= 25 || pointsPerGame >= 10 && reboundsPerGame >= 10 && assistsPerGame >= 10;

    println("Is all star? " + isAllStar);
}