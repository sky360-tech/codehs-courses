function start(){
	// Write your code here
    var arr = [1,2,3,4];
    var double = doubleList(arr);
    println(double);
}

    
function doubleList(arr){
    var arr2 = [];
    for(var i = 0; i < arr.length; i++){
     arr2.push(arr[i]);
     arr2.push(arr[i]);

    }
    return arr2;
}// reviewed: 2026-08-20
