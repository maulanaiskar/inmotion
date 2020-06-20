import java.util.Arrays;
public class MainSortAlphabet {
    public static void main(String[] args) {
        String [] array = {"z", "d", "a", "b"};
        System.out.println("Sebelum disorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);

        System.out.println("Setelah disorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

}
