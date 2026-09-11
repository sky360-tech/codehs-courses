function start(){
    var weekday = readBoolean("Is it a weekday?");
    var holiday = readBoolean("Is it a holiday?");
    var isSchoolOpen = !weekday || holiday;
    println("School's out? :" + isSchoolOpen);
    
}// reviewed: 2026-09-11
