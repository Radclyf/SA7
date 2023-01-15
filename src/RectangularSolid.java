import javax.swing.*;

public class RectangularSolid extends Figure{
    private final double length;
    private final double width;
    private final double height;

    public RectangularSolid (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
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
        return "Rectangular Solid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Cube extends RectangularSolid {
        private double side;
        public Cube(double side) {
            super(side, side, side);
            try {
                if(side < 0) {
                    throw new IllegalArgumentException("side cannot be negative");
                }
                this.side = side;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
            }
        }

        @Override
        public double getSurfaceArea() {
            return 6 * side * side;
        }

        @Override
        public double getVolume() {
            return  side * side * side;
        }

        @Override
        public String toString() {
            return "Cube (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }

    }
}
