public class RectangularSolid extends Figure{
    private double length;
    private double width;
    private double height;

    public RectangularSolid (double length, double width, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
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
    public String toString() {
        return "Rectangular Solid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Cube extends RectangularSolid {
        private double side;
        public Cube(double side) {
            super(side, side, side);
            this.side = side;
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
            return "Rectangular Solid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }

    }
}
