import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();

            // Add the first row of the triangle.
            list.add(Arrays.asList(1));

            // Calculate the remaining rows of the triangle.
            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                row.add(1);

                for (int j = 1; j < i; j++) {
                    row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }

                row.add(1);
                list.add(row);
            }

            return list;
        }
    }
}
