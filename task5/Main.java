package task5;
// 11111
// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         System.out.println(uniqueOrder(input));
//     }
//     public static String uniqueOrder(String s) {
//         Set<Character> seen = new HashSet<>();
//         StringBuilder result = new StringBuilder();
//         for (char c : s.toCharArray()) {
//             if (!seen.contains(c)) {
//                 seen.add(c);
//                 result.append(c);
//             }
//         }
//         return result.toString();
//     }
// }
// 2222222222
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         System.out.println(skipSevenSum(n));
//     }
//     public static int skipSevenSum(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (!containsSeven(i)) {
//                 sum += i;
//             }
//         }
//         return sum;
//     }
//     private static boolean containsSeven(int number) {
//         while (number > 0) {
//             if (number % 10 == 7) {
//                 return true;
//             }
//             number /= 10;
//         }
//         return false;
//     }
// }
// 33333333333
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         Object parsed = parse(input);
//         List<Integer> result = new ArrayList<>();
//         deepFlatten(parsed, result);
//         System.out.println(result);
//     }
//     private static void deepFlatten(Object obj, List<Integer> result) {
//         if (obj instanceof Integer) {
//             result.add((Integer) obj);
//         } else if (obj instanceof List<?>) {
//             for (Object element : (List<?>) obj) {
//                 deepFlatten(element, result);
//             }
//         }
//     }
//     private static Object parse(String s) {
//         Stack<List<Object>> stack = new Stack<>();
//         List<Object> current = new ArrayList<>();
//         stack.push(current);
//         int number = 0;
//         boolean inNumber = false;
//         for (char c : s.toCharArray()) {
//             if (Character.isDigit(c)) {
//                 number = number * 10 + (c - '0');
//                 inNumber = true;
//             } else {
//                 if (inNumber) {
//                     stack.peek().add(number);
//                     number = 0;
//                     inNumber = false;
//                 }
//                 if (c == '[') {
//                     List<Object> newList = new ArrayList<>();
//                     stack.peek().add(newList);
//                     stack.push(newList);
//                 } else if (c == ']') {
//                     stack.pop();
//                 }
//             }
//         }
//         return current.get(0);
//     }
// }
// 4444444444
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         long n = scanner.nextLong();
//         System.out.println(turns(n));
//     }
//     public static int turns(long n) {
//         int prev = (int) (n % 10);
//         n /= 10;
//         int direction = 0;
//         int count = 0;
//         while (n > 0) {
//             int cur = (int) (n % 10);
//             n /= 10;
//             if (cur == prev) {
//                 continue;
//             }
//             int newDirection = cur < prev ? 1 : -1;
//             if (direction != 0 && newDirection != direction) {
//                 count++;
//             }
//             direction = newDirection;
//             prev = cur;
//         }
//         return count;
//     }
// }
// 55555555555
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         String[] parts = line.replaceAll("[\\[\\]\\s]", "").split(",");
//         int[] arr = new int[parts.length];
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }
//         System.out.println(isLandscape(arr));
//     }
//     public static boolean isLandscape(int[] a) {
//         if (a.length < 3) {
//             return false;
//         }
//         int i = 1;
//         while (i < a.length && a[i] > a[i - 1]) {
//             i++;
//         }
//         if (i == 1 || i == a.length) {
//             return false;
//         }
//         while (i < a.length && a[i] < a[i - 1]) {
//             i++;
//         }
//         return i == a.length;
//     }
// }
//
// 66666666666
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         String[] parts = line.split(",\\s*");
//         System.out.println(findShift(parts[0], parts[1]));
//     }
//     public static int findShift(String a, String b) {
//         if (a.length() != b.length()) {
//             return -1;
//         }
//         int shift = (b.charAt(0) - a.charAt(0) + 26) % 26;
//         for (int i = 1; i < a.length(); i++) {
//             int cur = (b.charAt(i) - a.charAt(i) + 26) % 26;
//             if (cur != shift) {
//                 return -1;
//             }
//         }
//         return shift;
//     }
// }
//
// 77777777777
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         String[] parts = line.replaceAll("[\\[\\]\\s]", "").split(",");
//         int[] arr = new int[parts.length];
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }
//         System.out.println(maxSubarrayEven(arr));
//     }
//     public static int maxSubarrayEven(int[] a) {
//         int maxSum = 0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i + 1; j < a.length; j++) {
//                 int sum = a[i] + a[j];
//                 if (sum % 2 == 0 && sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         return maxSum;
//     }
// }
//
// 88888888888
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         line = line.replaceAll("[\\[\\]\\s]", "");
//         if (line.isEmpty()) {
//             System.out.println(0);
//             return;
//         }
//         String[] parts = line.split(",");
//         int[] arr = new int[parts.length];
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }
//         double result = spread(arr);
//         if (result == 0) {
//             System.out.println(0);
//         } else {
//             System.out.println(result);
//         }
//     }
//     public static double spread(int[] arr) {
//         if (arr.length == 0) {
//             return 0;
//         }
//         int min = arr[0], max = arr[0];
//         double sum = 0;
//         for (int x : arr) {
//             if (x < min) {
//                 min = x;
//             }
//             if (x > max) {
//                 max = x;
//             }
//             sum += x;
//         }
//         double avg = sum / arr.length;
//         if (avg == 0) {
//             return 0;
//         }
//         return (max - min) / avg;
//     }
// }
//
// 99999999999
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         String[] parts = line.split(",\\s*");
//         String s1 = parts[0];
//         String s2 = parts[1];
//         System.out.println(sameLetterPattern(s1, s2));
//     }
//     public static boolean sameLetterPattern(String s1, String s2) {
//         if (s1.length() != s2.length()) {
//             return false;
//         }
//         Map<Character, Character> map1 = new HashMap<>();
//         Map<Character, Character> map2 = new HashMap<>();
//         for (int i = 0; i < s1.length(); i++) {
//             char c1 = s1.charAt(i);
//             char c2 = s2.charAt(i);
//             if (!map1.containsKey(c1)) {
//                 map1.put(c1, c2);
//             } else if (map1.get(c1) != c2) {
//                 return false;
//             }
//             if (!map2.containsKey(c2)) {
//                 map2.put(c2, c1);
//             } else if (map2.get(c2) != c1) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
//
// 101010101010
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split(",\\s*");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        System.out.println(memeSum(a, b));
    }

    public static int memeSum(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);

        int lenA = sa.length();
        int lenB = sb.length();
        int maxLen = Math.max(lenA, lenB);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            int digitA = i < lenA ? sa.charAt(lenA - 1 - i) - '0' : 0;
            int digitB = i < lenB ? sb.charAt(lenB - 1 - i) - '0' : 0;

            int sum = digitA + digitB;
            result.insert(0, sum);
        }

        return Integer.parseInt(result.toString());
    }
}
