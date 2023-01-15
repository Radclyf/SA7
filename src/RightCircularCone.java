import javax.swing.*;

public class RightCircularCone extends Figure{
    public double radius1;
    public double height5;


    public RightCircularCone(double radius1, double height5){
        try {
            if(radius1 < 0) {
                throw new IllegalArgumentException("radius cannot be negative");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }
        this.radius1 = radius1;
        this.height5 = height5;
    }
    @Override
    public double getSurfaceArea() {
        return Math.PI * radius1 * (radius1 + Math.sqrt(Math.pow(height5, 2) + Math.pow(radius1, 2)));
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius1, 2) * height5 / 3;
    }

    @Override
    public String getShape() {
        return null;
    }

    @Override
    public Object getNumber() {
        return null;
    }

    @Override
    public String toString() {
        return "Right Circular Cone (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}