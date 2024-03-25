import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        int initialSize = source.size();
        int elementAccepted = 0;
        for (Integer integer : source) {
            if (integer < treshold) {
                logger.log("Элемент " + integer + " не проходит");
            } else {
                logger.log("Элемент " + integer + " проходит");
                elementAccepted++;
            }
        }
        source.removeIf(x -> x < treshold);
        logger.log("Прошло фильтр " + elementAccepted + " элементов из " + initialSize);
        return new ArrayList<>(source);
    }
}
