public class rgb_to_hex {
    /*
    Integer values for color - (r, g, b)
    Create a hexColor string object and call rgbToHex
    */
    public static void main(String[] args) {
        int r = 255; // red value
        int g = 127; // green value
        int b = 0; // blue value
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    /*
    Function to convert rgb color values to a hex code
    */
    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r)); // takes minimum value to use as r value
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


