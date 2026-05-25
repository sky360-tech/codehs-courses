// Constants for the image
var IMAGE_URL = "https://codehs.com/static/img/about/goldengate.jpg";
var IMAGE_WIDTH = 350;
var IMAGE_HEIGHT = 250;
var IMAGE_X = getWidth() / 2 - IMAGE_WIDTH / 2;
var IMAGE_Y = getHeight() / 2 - IMAGE_HEIGHT / 2;
var RED = 0;
var GREEN = 0;
var BLUE = 0;
// Constants for the filter
var DARKENING_FACTOR = 25;
var MIN_PIXEL_VALUE = 0;

// Constants for pixel indices
var RED = 0;
var GREEN = 1;
var BLUE = 2;

// We need to wait for the image to load before modifying it
var IMAGE_LOAD_WAIT_TIME = 50;

// Filter that takes an image as a parameter 
// and darkens the pixels in the left half of the image
function darkenFilter(image) {
    
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
        darkenFilter(image);
    }, IMAGE_LOAD_WAIT_TIME);
}