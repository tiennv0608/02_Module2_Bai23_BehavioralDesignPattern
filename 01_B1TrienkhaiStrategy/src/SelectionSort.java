import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> list) {
        System.out.println("Selection sort");
    }
}
