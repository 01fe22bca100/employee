public class employee {

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Main method to test the shapes class
    public static void main(String[] args) {
        double base = 5;
        double height = 8;
        double length = 10;
        double width = 6;
        double radius = 4;

        // Calculate and display the area of a triangle
        System.out.println("Area of triangle: " + calculateTriangleArea(base, height));

        // Calculate and display the area of a rectangle
        System.out.println("Area of rectangle: " + calculateRectangleArea(length, width));

        // Calculate and display the area of a circle
        System.out.println("Area of circle: " + calculateCircleArea(radius));

        // Calculate and display the area of a square
        System.out.println("Area of square: " + calculateSquareArea(length));
    }
}