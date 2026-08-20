function start(){
	
    var num1 = 15;
    oddOrEven(num1);
    var num2 = 32;
    oddOrEven(num2);
    var num3 = 19;
    oddOrEven(num3);
    var num4 = 11;
    oddOrEven(num4);
    var num5 = 28;
    oddOrEven(num5);
    var num6 = 24;
    oddOrEven(num6);
    var evens = oddOrEven();
    println(evens);
}

function oddOrEven(arr){
    var arr2 = [];
    for(var i = 0; i < arr.length; i++){
    
    if(arr[i] % 2==0){
        arr2.push(arr[i]);
    }
    return arr2; 
}

    }// reviewed: 2026-08-20
