import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("��������� ���������");
        logger.log("������ ������������ ������ ������� ������ ��� ������");
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �������� ������� ������: ");
        int N = scanner.nextInt();
        System.out.print("������� �������� ������� ������� ������: ");
        int M = scanner.nextInt();

        logger.log("������ � ��������� ������");
        Integer[] array = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(M);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list.toString());

        logger.log("������ ������������ ������ ������� ������ ��� ����������");
        System.out.print("������� �������� ��� ���������� ������: ");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);
        filter.filterOut(list);
        logger.log("������� ��������� �� �����");
        System.out.println("��������������� ������: " + list.toString());
        logger.log("��������� ���������");
    }
}
