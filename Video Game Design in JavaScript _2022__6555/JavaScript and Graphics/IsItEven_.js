var SENTINEL = 0;

// Prints whether the entered number is even or odd
function start(){

while(true){

var num = readInt("Enter Number: ");

if(num==0){

break;

}

if (isEven(num)==true){

println("even");

}else{

println("Odd");

}


}

println("done");

}
function isEven(num){

if(num%2==0){

return true;


}else{

return false;


}


}