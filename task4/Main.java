package task4;

// 11111111111111111111111
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;
// public class Main {
//     public static String nonRepeat(String s) {
//         Map<Character, Integer> freq = new HashMap<>();
//         countRecursive(s, 0, freq);
//         return buildRecursive(s, 0, freq);
//     }
//     private static void countRecursive(String s, int index, Map<Character, Integer> freq) {
//         if (index == s.length()) {
//             return;
//         }
//         char c = Character.toLowerCase(s.charAt(index));
//         freq.put(c, freq.getOrDefault(c, 0) + 1);
//         countRecursive(s, index + 1, freq);
//     }
//     private static String buildRecursive(String s, int index, Map<Character, Integer> freq) {
//         if (index == s.length()) {
//             return "";
//         }
//         char original = s.charAt(index);
//         char key = Character.toLowerCase(original);
//         String tail = buildRecursive(s, index + 1, freq);
//         if (freq.get(key) > 3) {
//             return tail;
//         } else {
//             return original + tail;
//         }
//     }
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             String input = in.nextLine();
//             System.out.println(nonRepeat(input));
//         }
//     }
// }
// 22222222222222222222222
// import java.util.*;
// public class Main {
//     static List<String> results = new ArrayList<>();
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             String line = in.nextLine();
//             String[] parts = line.split(",");
//             int n = Integer.parseInt(parts[0].trim());
//             int k = Integer.parseInt(parts[1].trim());
//             if (k > 5) {
//                 return;
//             }
//             boolean[] used = new boolean[k];
//             backtrack("", n, k, used);
//             System.out.print("[");
//             for (int i = 0; i < results.size(); i++) {
//                 System.out.print("\"" + results.get(i) + "\"");
//                 if (i != results.size() - 1) {
//                     System.out.print(",");
//                 }
//             }
//             System.out.println("]");
//         }
//     }
//     static void backtrack(String current, int n, int k, boolean[] used) {
//         if (current.length() == n) {
//             results.add(current);
//             return;
//         }
//         for (int i = 0; i < k; i++) {
//             if (!used[i]) {
//                 used[i] = true;
//                 backtrack(current + i, n, k, used);
//                 used[i] = false;
//             }
//         }
//     }
// }
// 333333333333333333333
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) {
                return;
            }

            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                return;
            }

            String[] parts = line.split(",", 2);
            if (parts.length != 2) {
                return;
            }

            String message = parts[0].trim();
            String key = parts[1].trim();

            message = removeQuotes(message);
            key = removeQuotes(key);

            if (message.isEmpty() && key.isEmpty()) {
                System.out.println("[]");
                return;
            }

            if (message.length() != key.length()) {
                return;
            }

            int[] result = Decode(message, key);

            System.out.print("[");
            for (int i = 0; i < result.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(result[i]);
            }
            System.out.println("]");

        } catch (Exception e) {
            return;
        }
    }

    private static String removeQuotes(String s) {
        if (s.startsWith("\"") && s.endsWith("\"")) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    public static int[] Decode(String message, String key) {
        int len = message.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = message.charAt(i) ^ key.charAt(i);
        }
        return res;
    }
}

// 4444444444444444444
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             int number = Integer.parseInt(scanner.nextLine());
//             System.out.println(convertToRome(number));
//         }
//     }
//     public static String convertToRome(int num) {
//         String[] thousands = {"", "M", "MM", "MMM"};
//         String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//         String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//         String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//         return thousands[num / 1000]
//                 + hundreds[(num % 1000) / 100]
//                 + tens[(num % 100) / 10]
//                 + ones[num % 10];
//     }
// }
// 5555555555555555555
// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String input = scanner.nextLine();
//             String[] parts = input.split("],");
//             String arrayStr = parts[0].replace("[", "").replace("]", "");
//             String[] numbersStr = arrayStr.split(",");
//             int[] nums = new int[numbersStr.length];
//             for (int i = 0; i < numbersStr.length; i++) {
//                 nums[i] = Integer.parseInt(numbersStr[i].trim());
//             }
//             int k = Integer.parseInt(parts[1].trim());
//             System.out.println(pairDifference(nums, k));
//         }
//     }
//     public static int pairDifference(int[] nums, int k) {
//         if (k < 0) {
//             return 0;
//         }
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int num : nums) {
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }
//         int count = 0;
//         if (k == 0) {
//             for (int value : freq.values()) {
//                 count += value * (value - 1) / 2;
//             }
//         } else {
//             for (int num : freq.keySet()) {
//                 if (freq.containsKey(num + k)) {
//                     count += freq.get(num) * freq.get(num + k);
//                 }
//             }
//         }
//         return count;
//     }
// }
// 6666666666666666666
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             long number = Long.parseLong(scanner.nextLine());
//             int[] result = digitHistogram(number);
//             System.out.print("[");
//             for (int i = 0; i < result.length; i++) {
//                 System.out.print(result[i]);
//                 if (i < result.length - 1) {
//                     System.out.print(",");
//                 }
//             }
//             System.out.println("]");
//         }
//     }
//     public static int[] digitHistogram(long num) {
//         int[] histogram = new int[10];
//         String str = Long.toString(num);
//         for (int i = 0; i < str.length(); i++) {
//             char digitChar = str.charAt(i);
//             int digit = digitChar - '0';
//             histogram[digit]++;
//         }
//         return histogram;
//     }
// }
// 777777777777777777
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String input = scanner.nextLine();
//             input = input.replace("[", "").replace("]", "");
//             String[] numbersStr = input.split(",");
//             int[] nums = new int[numbersStr.length];
//             for (int i = 0; i < numbersStr.length; i++) {
//                 nums[i] = Integer.parseInt(numbersStr[i].trim());
//             }
//             System.out.println(maxConsecutiveOnes(nums));
//         }
//     }
//     public static int maxConsecutiveOnes(int[] nums) {
//         int maxCount = 0;
//         int currentCount = 0;
//         for (int num : nums) {
//             if (num == 1) {
//                 currentCount++;
//                 if (currentCount > maxCount) {
//                     maxCount = currentCount;
//                 }
//             } else {
//                 currentCount = 0;
//             }
//         }
//         return maxCount;
//     }
// }
// 888888888888888888
// import java.util.Scanner;
// import java.util.Map;
// import java.util.LinkedHashMap;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String text = scanner.nextLine();
//             System.out.println(wordHistogram(text));
//         }
//     }
//     public static String wordHistogram(String text) {
//         String[] words = text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
//         Map<String, Integer> map = new LinkedHashMap<>();
//         for (String word : words) {
//             if (!word.isEmpty()) {
//                 map.put(word, map.getOrDefault(word, 0) + 1);
//             }
//         }
//         StringBuilder result = new StringBuilder("{");
//         boolean first = true;
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             if (!first) {
//                 result.append(", ");
//             }
//             result.append(entry.getKey()).append(": ").append(entry.getValue());
//             first = false;
//         }
//         result.append("}");
//         return result.toString();
//     }
// }
// 9999999999999999999
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String input = scanner.nextLine();
//             input = input.replace("[[", "").replace("]]", "");
//             String[] rows = input.split("\\],\\[");
//             int n = rows.length;
//             int m = rows[0].split(",").length;
//             int[][] grid = new int[n][m];
//             for (int i = 0; i < n; i++) {
//                 String[] values = rows[i].split(",");
//                 for (int j = 0; j < m; j++) {
//                     grid[i][j] = Integer.parseInt(values[j].trim());
//                 }
//             }
//             System.out.println(countIslands(grid));
//         }
//     }
//     public static int countIslands(int[][] grid) {
//         if (grid.length == 0) {
//             return 0;
//         }
//         int count = 0;
//         int rows = grid.length;
//         int cols = grid[0].length;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (grid[i][j] == 1) {
//                     count++;
//                     dfs(grid, i, j);
//                 }
//             }
//         }
//         return count;
//     }
//     private static void dfs(int[][] grid, int i, int j) {
//         int rows = grid.length;
//         int cols = grid[0].length;
//         if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0) {
//             return;
//         }
//         grid[i][j] = 0;
//         dfs(grid, i - 1, j);
//         dfs(grid, i + 1, j);
//         dfs(grid, i, j - 1);
//         dfs(grid, i, j + 1);
//     }
// }
// 101010101010101010101010
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String input = scanner.nextLine();
//             input = input.replace("[", "").replace("]", "");
//             String[] gradesStr = input.split(",");
//             int[] grades = new int[gradesStr.length];
//             for (int i = 0; i < gradesStr.length; i++) {
//                 grades[i] = Integer.parseInt(gradesStr[i].trim());
//             }
//             System.out.println(evaluateGrades(grades));
//         }
//     }
//     public static String evaluateGrades(int[] grades) {
//         int a = 0, b = 0, c = 0, d = 0, f = 0;
//         for (int grade : grades) {
//             if (grade >= 90) {
//                 a++;
//             } else if (grade >= 80) {
//                 b++;
//             } else if (grade >= 70) {
//                 c++;
//             } else if (grade >= 60) {
//                 d++;
//             } else {
//                 f++;
//             }
//         }
//         StringBuilder result = new StringBuilder("{");
//         boolean first = true;
//         if (a > 0) {
//             result.append("A: ").append(a);
//             first = false;
//         }
//         if (b > 0) {
//             if (!first) {
//                 result.append(", ");
//             }
//             result.append("B: ").append(b);
//             first = false;
//         }
//         if (c > 0) {
//             if (!first) {
//                 result.append(", ");
//             }
//             result.append("C: ").append(c);
//             first = false;
//         }
//         if (d > 0) {
//             if (!first) {
//                 result.append(", ");
//             }
//             result.append("D: ").append(d);
//             first = false;
//         }
//         if (f > 0) {
//             if (!first) {
//                 result.append(", ");
//             }
//             result.append("F: ").append(f);
//         }
//         result.append("}");
//         return result.toString();
//     }
// }
