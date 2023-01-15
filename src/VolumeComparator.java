import java.util.Comparator;

class VolumeComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure f1, Figure f2) {
        return Double.compare(f1.getVolume(), f2.getVolume());
    }
}
