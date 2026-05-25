function start(){
    var miles = readInt(" How far did you run? ");
    var minutes = readInt("How many minutes");
    var hours = minutes / 60;

    var speed = miles/ hours;
    println("Speed in mph: " +speed);
}