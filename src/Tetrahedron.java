public class Tetrahedron extends Figure{
    private double sideLength;


    public Tetrahedron(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double getSurfaceArea() {
        return Math.sqrt(3) * (sideLength * sideLength);
    }

    @Override
    public double getVolume() {
        return (Math.pow(sideLength,3))/(6 * Math.sqrt(2));
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
        return "Tetrahedron (surface area: " + getSurfaceArea() + ", volume: " + getVolume() + ")";
    }
}
