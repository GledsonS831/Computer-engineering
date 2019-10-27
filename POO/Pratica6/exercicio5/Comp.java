import java.util.Comparator;

public class Comp implements Comparator<Integer> {


    @Override
    public int compare(Integer integer, Integer t1) {
        return integer - t1;
    }
}
