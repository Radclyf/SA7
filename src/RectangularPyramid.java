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
    public String toString() {
        return "Rectangular Pyramid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Pyramid extends RectangularPyramid {
        private double length2;
        private double width2;
        private double height2;
        public Pyramid(double length2, double width2, double height2) {
            super(length2, width2, height2);
            this.height2 = height2;
            this.width2 = width2;
            this.length2 = length2;
        }

        @Override
        public double getSurfaceArea() {
            return length2 * width2 + length2 * Math.sqrt(Math.pow(width2 / 2, 2) + Math.pow(height2, 2) + width2) * Math.sqrt(Math.pow(1 / 2, 2) + Math.pow(height2, 2));
        }

        @Override
        public double getVolume() {
            return length2 * width2 * height2 / 3;
        }

        @Override
        public String toString() {
            return "Pyramid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }
    }
}
