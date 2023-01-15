import javax.swing.*;

public class RectangularSolid extends Figure{
    private double length;
    private double width;
    private double height;

    public RectangularSolid (double length, double width, double height) {
        try {
            if(height < 0) {
                throw new IllegalArgumentException("height cannot be negative");
            }
            this.height = height;
            if(width < 0) {
                throw new IllegalArgumentException("width cannot be negative");
            }
            this.width = width;
            if(length < 0) {
                throw new IllegalArgumentException("length cannot be negative");
            }
            this.length = length;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
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
