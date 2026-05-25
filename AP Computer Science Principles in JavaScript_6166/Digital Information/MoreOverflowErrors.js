// Other Overflow Errors

/* 1. Rounding Error

In JavaScript, a floating point number has a limited precision of 64 bits
which is about 16 digits. This can cause rounding off errors. Uncomment the 
first code segment to see this in action.

To uncomment a whole section - highlight the section and hit Shift (or Command) 
+ the "/" key.

*/

    
    var x = 0.1 * 0.2; // should equal 0.02
    println(x);



/* 2. Exceeding the max and min numbers

Values smaller than the minimum are stored as 0, and values larger than the 
maximum are stored as +/- Infinity.

*/

    
    println(1e309);   // Infinity
    println(-1e309);   // -Infinity
    println(1e-324)  // 0