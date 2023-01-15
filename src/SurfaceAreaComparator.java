import java.util.Comparator;

class SurfaceAreaComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure f1, Figure f2) {
        return -1 * Double.compare(f1.getSurfaceArea(), f2.getSurfaceArea());
    }
}
