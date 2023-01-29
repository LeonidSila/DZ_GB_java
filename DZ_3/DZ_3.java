package DZ_3;


import java.util.ArrayList;
import java.util.Collections;
public class DZ_3 {
        public static void main(String args[])
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(10);
            arr.add(20);
            arr.add(5);
            arr.add(8);
            int n = arr.size();
            System.out.println("ArrayList тут :");

            for (int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }

            System.out.println();

            int max = Collections.max(arr);
            System.out.println("Максимальный: " + max);

            int min = Collections.min(arr);
            System.out.println("Минимальный: " + min);
        }
    }

