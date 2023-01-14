public class Prism extends Figure{
    private double base;
    private double perimeter;
    private double height3;

    public Prism(double base, double perimeter, double height3) {
        this.base = base;
        this.perimeter = perimeter;
        this.height3 = height3;
    }
    @Override
    public double getSurfaceArea() {
        return 2 * base + perimeter * height3;
    }

    @Override
    public double getVolume() {
        return base * height3;
    }

    @Override
    public String toString() {
        return "Prism (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}
