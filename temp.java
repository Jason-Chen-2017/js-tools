import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str_0 = scan.nextLine().trim();
        int n = Integer.parseInt(str_0);
        ArrayList<ArrayList<Integer>> vector = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str_1 = scan.nextLine();
            String[] line_list_1 = str_1.trim().split(" ");
            ArrayList<Integer> temp_1 = new ArrayList<>();
            for (int j = 0; j < line_list_1.length; j++) {
                temp_1.add(Integer.parseInt(line_list_1[j]));
            }
            vector.add(temp_1);
        }
        scan.close();
        int result = solution(n, vector);
        out.println(result);
    }

    public static int solution(int n, ArrayList<ArrayList<Integer>> vector) {
        int result = 0;
        int[] row = new int[1005];
        int[] col = new int[1005];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int g = vector.get(i).get(j);
                row[i] += g;
                col[j] += g;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] < col[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}