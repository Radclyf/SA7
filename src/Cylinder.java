import javax.swing.*;

public class Cylinder extends Figure{
    private double radius;
    private double height2;

    public Cylinder(double radius, double height2) {
        this.height2 = height2;
        try {
            if(radius < 0) {
                throw new IllegalArgumentException("radius cannot be negative");
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }
        this.radius = radius;
    }
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height2 + 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height2;
    }

    @Override
    public String toString() {
        return "Cylinder (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}
