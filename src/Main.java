import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение размера списка: ");
        int N = scanner.nextInt();
        System.out.print("Введите значение верхней границы списка: ");
        int M = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Integer[] array = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(M);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите значение для фильтрации списка: ");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);
        filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list.toString());
        logger.log("Завершаем программу");
    }
}
