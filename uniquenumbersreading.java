import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uniquenumbersreading {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);

        int len = arr.size() - 1;



        while (!arr.isEmpty()){

            int key = arr.get(0);
            int count = 1;

            for (int i = 1; i < arr.size(); i++) {

                if (key == arr.get(i)) {

                    ++count;
                    arr.remove(i);
                }

            }
            arr.remove(0);
            System.out.println(key + "(" + count + ")");





        }


    }
}
