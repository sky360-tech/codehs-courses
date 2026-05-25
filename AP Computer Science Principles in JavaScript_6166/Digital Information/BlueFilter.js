// Constants for the image
var IMAGE_URL = "https://static.codehs.com/img/library/characters/monkey.jpg";
var IMAGE_WIDTH = 350;
var IMAGE_HEIGHT = 250;
var IMAGE_X = getWidth() / 2 - IMAGE_WIDTH / 2;
var IMAGE_Y = getHeight() / 2 - IMAGE_HEIGHT / 2;
var RED = 0;
var BLUE = 255;
var GREEN = 0;

// We need to wait for the image to load before modifying it
var IMAGE_LOAD_WAIT_TIME = 50;

// Filter that sets the blue value of every pixel in the image to be 0
function removeBlue(image) {
    
    // WRITE YOUR CODE HERE!
        for(var x = 0; x < image.getWidth(); x++) {
        for(var y = 0; y < image.getHeight(); y++) {
            // Get the pixel at this location
            var pixel = image.getPixel(x, y);
            
            // Modify it

            // Update the image with the modified pixel
            image.setRed(x, y, pixel[RED]);
            image.setGreen(x, y, pixel[GREEN]);
            image.setBlue(x, y, pixel[BLUE]);
        }
    }
}


function start() {
    // Set up the image
    var image = new WebImage(IMAGE_URL);
    image.setSize(IMAGE_WIDTH, IMAGE_HEIGHT);
    image.setPosition(IMAGE_X, IMAGE_Y);
    
    // Add it to the canvas
    add(image);
    
    // Wait for it to load before applying the filter
    setTimeout(function(){
        removeBlue(image);
    }, IMAGE_LOAD_WAIT_TIME);
}