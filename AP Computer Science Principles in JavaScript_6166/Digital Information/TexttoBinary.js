/*
 * This program encodes user input into binary data!
 * Your job is to write the textToBinary function
 */
 
function start()
{
    var text = readLine("Input the string you would like to encode: ");
    
    var binary = textToBinary(text);
    
    println(binary);
}

function textToBinary(text)
{
    // Write this method!
   var  result = ""
    // For every character in the text,
        // convert the character into its ASCII decimal encoding
        // then convert that decimal value into its equivalent binary encoding
        // and combine each binary encoding to get the resulting binary string
        
        for(var i = 0; i< text.length; i++){
        var numericValue = text.charCodeAt(i);
        var binaryValue = decimalToBinary(numericValue);
        result += binaryValue;
        }
        return result;
}


// Converts a given decimal value into an 8 bit binary value
function decimalToBinary(decimalValue)
{
    var binaryBase = 2;
    var numBitsDesired = 8;
    var binaryValue = decimalValue.toString(binaryBase);
    
    while(binaryValue.length < numBitsDesired)
    {
        binaryValue = "0" + binaryValue;
    }
    
    return binaryValue;
}// reviewed: 2026-08-25
