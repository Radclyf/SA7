import java.util.Comparator;

class FigureComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure f1, Figure f2) {
        return f1.getShape().compareTo(f2.getShape());
    }
}
