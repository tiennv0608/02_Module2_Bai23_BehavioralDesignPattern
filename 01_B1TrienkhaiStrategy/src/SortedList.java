import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy strategy;
    private List<String> list = new ArrayList<>();

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name){
        list.add(name);
    }

    public void sort(){
        strategy.sort(list);
    }
}
