public class Ellipsoid extends Figure{
    private double r1;
    private double r2;
    private double r3;
    public Ellipsoid(double r1, double r2, double r3) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }
    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.sqrt((r1*r2 + r2*r3 + r1*r3)/3);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * r1 * r2 * r3;
    }

    @Override
    public String toString() {
        return "Ellipsoid (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }

    public static class Sphere extends Ellipsoid {
        private double radius2;
        public Sphere(double radius2) {
            super(radius2, radius2, radius2);
            this.radius2 = radius2;
        }

        @Override
        public double getSurfaceArea() {
            return 4 * Math.PI * Math.pow(radius2, 2);
        }

        @Override
        public double getVolume() {
            return (4 / 3) * Math.PI * Math.pow(radius2, 3);
        }

        @Override
        public String toString() {
            return "Sphere (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
        }
    }
}
