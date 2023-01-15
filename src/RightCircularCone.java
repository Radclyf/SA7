import javax.swing.*;

public class RightCircularCone extends Figure{
    public double radius1;
    public double height4;


    public RightCircularCone(double radius1, double height4){
        try {
            if(radius1 < 0) {
                throw new IllegalArgumentException("radius cannot be negative");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }
        this.radius1 = radius1;
        this.height4 = height4;
    }
    @Override
    public double getSurfaceArea() {
        return Math.PI * radius1 * (radius1 + Math.sqrt(Math.pow(height4, 2) + Math.pow(radius1, 2)));
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius1, 2) * height4 / 3;
    }

    @Override
    public String toString() {
        return "Right Circular Cone (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}