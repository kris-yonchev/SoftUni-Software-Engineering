package encapsulationExercise.classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        checkSide(length, "Length");
        this.length = length;
    }


    private void setWidth(double width) {
        checkSide(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkSide(height, "Height");
        this.height = height;
    }

    private void checkSide(double parameter, String side) {
        if (parameter <= 0) {
            throw new IllegalArgumentException(side + " cannot be zero or negative");
        }

    }

    public double calculateSurfaceArea() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }


}
