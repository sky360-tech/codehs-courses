function start(){
	min (1,2);
	min (9000,9001);
}

function min (x,y){
    if(x<y){
        println("Minimum Value Is: " + x);
        return(x);
    }else{
        if (y<x){
            println("Minimum Value Is: " + y);
            return(y);
        }
        
    if (x==y){
        println("Minimum Value Is: " + x);
        return(x);
    }
    }
}