import javax.swing.*;

public class Ellipsoid extends Figure{
    private double a;
    private double b;
    private double c;

    public Ellipsoid(double a, double b, double c) {
        try {
            if(a < 0) {
                throw new IllegalArgumentException("A-axis cannot be negative");
            }
            this.a = a;
            if(b < 0) {
                throw new IllegalArgumentException("B-axis cannot be negative");
            }
            this.b = b;
            if(c < 0) {
                throw new IllegalArgumentException("C-axis cannot be negative");
            }
            this.c = c;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        }

    }
    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.sqrt(((a*b) + (b*c) + (a*c))/3);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }

    @Override
    public String getShape() {
        return null;
    }

    @Override
    public String toString() {
        return "Ellipsoid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Sphere extends Ellipsoid {
        private double radius2;
        public Sphere(double radius2) {
            super(radius2, radius2, radius2);
            try {
                if(radius2 < 0) {
                    throw new IllegalArgumentException("Radius cannot be negative");
                }
                this.radius2 = radius2;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for radius");
            }

        }

        @Override
        public double getSurfaceArea() {
            return 4 * Math.PI * Math.pow(radius2, 2);
        }

        @Override
        public double getVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius2, 3);
        }

        @Override
        public String toString() {
            return "Sphere (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }
    }
}
