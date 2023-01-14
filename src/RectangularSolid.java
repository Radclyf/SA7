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

}
