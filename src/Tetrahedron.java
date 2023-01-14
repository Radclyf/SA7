public class Tetrahedron extends Figure{
    private double area;


    public Tetrahedron(double area){
        this.area = area;
    }
    @Override
    public double getSurfaceArea() {
        return Math.sqrt(3) * Math.pow(area, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(area, 3) / 6 * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "Tetrahedron (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}
