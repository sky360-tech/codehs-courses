const SECRET = "abc123";  

function promptForPassword() {
    while (true) {  
        
        let userInput = prompt("Enter password:");

        if (userInput === SECRET) {
            println("You got it!");  
            break;  
        } else {
            println("Sorry, that did not match. Please try again."); 
        }
    }
}

promptForPassword();