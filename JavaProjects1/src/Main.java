import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile1 = new PrintWriter("1.txt");
        PrintWriter outputFile2 = new PrintWriter("2.txt");
        PrintWriter outputFile3 = new PrintWriter("3.txt");

        int[] list1 = new int[100];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = (int) (Math.random() * 1001);
        }
        System.out.println("LIST 1");
        outputFile1.println("LIST 1");
        for (int i = 0, j = 1; i < list1.length; i++, j++) {
            outputFile1.println(j + "-" + list1[i]);
            System.out.println(j + "-" + list1[i]);
        }
        System.out.println("------------------------------------------------------");
        //min-max
        int min = list1[0];
        int max = list1[0];

        for (int i : list1) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum value: " + min);
        outputFile1.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        outputFile1.println("Maximum value: " + max);

        System.out.println("------------------------------------------------------");
        //reverse sort -max to min
        System.out.println("LIST 2");
        outputFile2.println("LIST 2");
        int list2[] = Arrays.copyOf(list1, 100);
        Arrays.sort(list2);
        for (int m = list2.length - 1, t = 1; m >= 0; m--, t++) {
            System.out.print(t + "- " + list2[m]);
            outputFile2.print(t + "- " + list2[m]);
            for (int s = 0; s <= list1.length - 1; s++) {
                if (list2[m] == list1[s]) {
                    int index2 = Integer.valueOf(s);
                    System.out.println("  |  " + list2[m] + "  degerinin 1. listedeki yeri ->  " + (index2 + 1));
                    outputFile2.println("  |  " + list2[m] + "  degerinin 1. listedeki yeri ->  " + (index2 + 1));
                    break;
                }
            }
        }

        System.out.println("------------------------------------------------------");

        //sorting - min to max
        System.out.println("LIST 3");
        outputFile3.println("LIST 3");
        int list3[] = Arrays.copyOf(list1, 100);
        Arrays.sort(list3);
        for (int i = 0, j = 1; i < list1.length; i++, j++) {
            System.out.print(j + "-" + list3[i]);
            outputFile3.print(j + "-" + list3[i]);
            for (int k = 0; k <= list1.length - 1; k++) {
                if (list3[i] == list1[k]) {
                    int index3 = Integer.valueOf(k);
                    System.out.println("  |  " + list3[i] + "  degerinin 1. listedeki yeri ->  " + (index3 + 1));
                    outputFile3.println("  |  " + list3[i] + "  degerinin 1. listedeki yeri ->  " + (index3 + 1));
                    break;
                }


            }

        }
        outputFile1.close();
        outputFile2.close();
        outputFile3.close();
    }
}