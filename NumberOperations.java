import java.util.ArrayList;
import java.util.Arrays;

public class NumberOperations {

    private ArrayList<Byte> Bytes = new ArrayList<>();
    private ArrayList<Short> Shorts = new ArrayList<>();
    private ArrayList<Integer> Integers = new ArrayList<>();
    private ArrayList<Long> Longs = new ArrayList<>();
    private ArrayList<Float> Floats = new ArrayList<>();
    private ArrayList<Double> Doubles = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(10.0, 20.5, 30.0, 40.7, 50.0, 60.3, 70.0, 80.1, 90.0, 100.9));
        System.out.println("ArrayList: " + numbers);

        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;
        long num4 = 4;
        float num5 = 5.5f;
        double num6 = 6.6;

        numbers.add((double) num1);
        numbers.add((double) num2);
        numbers.add((double) num3);
        numbers.add((double) num4);
        numbers.add((double) num5);
        numbers.add(num6);

        System.out.print("\nIntegers: ");
        for (int i=0; i<numbers.size(); i++) {
            System.out.printf("%d ",numbers.get(i).intValue());
        }

        System.out.print("\n\nFloat numbers: ");
        for (int i=0; i<numbers.size(); i++) {
            System.out.printf("%.2f  ",numbers.get(i).floatValue());
        }

        System.out.print("\n\n");

        NumberOperations operations = new NumberOperations();

        operations.Numbertype(num1);
        operations.Numbertype(num2);
        operations.Numbertype(num3);
        operations.Numbertype(num4);
        operations.Numbertype(num5);
        operations.Numbertype(num6);

        operations.ArraiesListPrint();

        double average = 0;
        for (int i=0; i<numbers.size(); i++) {
            average += numbers.get(i);
        }
        System.out.printf("\nAverage: %f", (average / numbers.size()));

    }

    public void Numbertype(Number number) {
            if (number instanceof Byte) {
            Bytes.add(number.byteValue());
            } else if (number instanceof Short) {
                Shorts.add(number.shortValue());
            } else if (number instanceof Long) {
                Integers.add(number.intValue());
            } else if (number instanceof Integer) {
                Longs.add(number.longValue());
            } else if (number instanceof float) {
                Floats.add(number.floatValue());
            } else if (number instanceof double) {
                Doubles.add(number.doubleValue());
            }
    }

    public void ArraiesListPrint() {
        System.out.println("Bytes: " + Bytes);
        System.out.println("Shorts: " + Shorts);
        System.out.println("Integers: " + Integers);
        System.out.println("Longs: " + Longs);
        System.out.println("Floats: " + Floats);
        System.out.println("Doubles: " + Doubles);
    }
}