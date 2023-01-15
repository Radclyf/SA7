public class RectangularPyramid extends Figure{
    private double length1;
    private double width1;
    private double height1;


    public RectangularPyramid(double length1, double width1, double height1){
        this.length1 = length1;
        this.width1 = width1;
        this.height1 = height1;
    }
    @Override
    public double getSurfaceArea() {
        return length1 * width1 + length1 * Math.sqrt(Math.pow(width1 / 2, 2) + Math.pow(height1, 2) + width1) * Math.sqrt(Math.pow(1 / 2, 2) + Math.pow(height1, 2));
    }

    @Override
    public double getVolume() {
        return length1 * width1 * height1 / 3;
    }

    @Override
    public String getShape() {
        return null;
    }

    @Override
    public String toString() {
        return "Rectangular Pyramid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Pyramid extends RectangularPyramid {
        private double baseArea;
        private double perimeter1;
        private double height4;
        public Pyramid(double baseArea, double perimeter1, double height4) {
            super(baseArea, perimeter1, height4);
            this.height4 = height4;
            this.perimeter1 = perimeter1;
            this.baseArea = baseArea;
        }

        @Override
        public double getSurfaceArea() {
            return (baseArea + (perimeter1 * height4)) / 2;
        }

        @Override
        public double getVolume() {
            return (baseArea * height4) / 3;
        }

        @Override
        public String toString() {
            return "Pyramid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }
    }
}
