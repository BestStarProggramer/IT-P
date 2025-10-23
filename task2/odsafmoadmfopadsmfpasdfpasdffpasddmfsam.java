package task2;

// ЗАДАНИЕ 1
// import java.util.Scanner;

// public class CountDivisors {

//     public static int countDivisors(int n) {
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();

//         int result = countDivisors(n);

//         System.out.println(result);

//         scanner.close();
//     }
// }

// ЗАДАНИЕ 2
// import java.util.Scanner;
// public class SumRange {

//     public static int sumRange(int a, int b) {
//         int sum = 0;
//         for (int i = a; i <= b; i++) {
//             sum += i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();

//         String[] parts = input.split(",");
//         int a = Integer.parseInt(parts[0].trim());
//         int b = Integer.parseInt(parts[1].trim());

//         int result = sumRange(a, b);

//         System.out.println(result);

//         scanner.close();
//     }
// }

// ЗАДАНИЕ 3
// import java.util.Scanner;

// public class SumOfPositives {

//     public static int sumOfPositives(int[] numbers) {
//         int sum = 0;
//         for (int num : numbers) {
//             if (num > 0) {
//                 sum += num;
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();

//         String[] parts = input.split(",");
//         int[] numbers = new int[parts.length];

//         for (int i = 0; i < parts.length; i++) {
//             numbers[i] = Integer.parseInt(parts[i].trim());
//         }

//         int result = sumOfPositives(numbers);

//         System.out.println(result);

//         scanner.close();
//     }
// }

// ЗАДАНИЕ 4
// import java.util.Scanner;
// import java.util.HashSet;

// public class HasDuplicates {

//     public static boolean hasDuplicates(int[] numbers) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : numbers) {
//             if (!set.add(num)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();
//         String[] parts = input.split(",");
//         int[] numbers = new int[parts.length];

//         for (int i = 0; i < parts.length; i++) {
//             numbers[i] = Integer.parseInt(parts[i].trim());
//         }

//         System.out.println(hasDuplicates(numbers));

//         scanner.close();
//     }
// }


// ЗАДАНИЕ 5
// import java.util.Scanner;
// import java.util.Arrays;

// public class RotateArray {

//     public static int[] rotateRight(int[] arr, int k) {
//         if (arr.length == 0) return arr;
//         k = k % arr.length;
//         int[] rotated = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             rotated[(i + k) % arr.length] = arr[i];
//         }
//         return rotated;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();

//         String[] parts = input.split("],");
//         String arrayPart = parts[0].replaceAll("\\[", "").trim();
//         int k = Integer.parseInt(parts[1].trim());

//         String[] numStrs = arrayPart.split(",");
//         int[] arr = new int[numStrs.length];
//         for (int i = 0; i < numStrs.length; i++) {
//             arr[i] = Integer.parseInt(numStrs[i].trim());
//         }

//         int[] result = rotateRight(arr, k);
//         System.out.println(Arrays.toString(result));

//         scanner.close();
//     }
// }


// ЗАДАНИЕ 6
// import java.util.Scanner;
// public class ClampNumber {

//     public static int clamp(int value, int min, int max) {
//         if (value < min) return min;
//         if (value > max) return max;
//         return value;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();
//         String[] parts = input.split(",");
//         int value = Integer.parseInt(parts[0].trim());
//         int min = Integer.parseInt(parts[1].trim());
//         int max = Integer.parseInt(parts[2].trim());

//         int result = clamp(value, min, max);
//         System.out.println(result);

//         scanner.close();
//     }
// }


// ЗАДАНИЕ 7
// import java.util.Scanner;
// import java.util.Arrays;

// public class ImTiredOfDoingTheseStupidTasks {

//     public static int[] countEvenOddDigits(int n) {
//         n = Math.abs(n);
//         int even = 0;
//         int odd = 0;

//         if (n == 0) {
//             even = 1;
//         } else {
//             while (n > 0) {
//                 int digit = n % 10;
//                 if (digit % 2 == 0) even++;
//                 else odd++;
//                 n /= 10;
//             }
//         }

//         return new int[]{even, odd};
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();

//         int[] result = countEvenOddDigits(n);
//         System.out.println(result[0] + ", " + result[1]);

//         scanner.close();
//     }
// }


// ЗАДАНИЕ 8
// import java.util.Scanner;

// public class IHaveNoIdeaHowIWouldDoThisWithoutIDE {

//     public static int diagonalSum(int[][] matrix) {
//         int sum = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             sum += matrix[i][i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();

//         input = input.replaceAll("\\[\\[|\\]\\]", ""); 
//         String[] rows = input.split("\\],\\[");      

//         int n = rows.length;
//         int[][] matrix = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             String[] nums = rows[i].split(",");
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = Integer.parseInt(nums[j].trim());
//             }
//         }

//         int result = diagonalSum(matrix);
//         System.out.println(result);

//         scanner.close();
//     }
// }


// ЗАДАНИЕ 9
// import java.util.Scanner;
// import java.util.Set;
// import java.util.TreeSet;

// public class AintNoWayIWouldUseBubbleSortMethod {

//     public static int[] mergeUniqueSorted(int[] a, int[] b) {
//         Set<Integer> set = new TreeSet<>();
//         for (int num : a) set.add(num);
//         for (int num : b) set.add(num);

//         int[] result = new int[set.size()];
//         int i = 0;
//         for (int num : set) result[i++] = num;
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String input = scanner.nextLine();

//         String[] arrays = input.split("\\],"); 
//         String[] partsA = arrays[0].replaceAll("\\[|\\]", "").trim().split(",");
//         String[] partsB = arrays[1].replaceAll("\\[|\\]", "").trim().split(",");

//         int[] a = new int[partsA.length];
//         int[] b = new int[partsB.length];

//         for (int i = 0; i < partsA.length; i++) a[i] = Integer.parseInt(partsA[i].trim());
//         for (int i = 0; i < partsB.length; i++) b[i] = Integer.parseInt(partsB[i].trim());

//         int[] result = mergeUniqueSorted(a, b);

//         System.out.print("[");
//         for (int i = 0; i < result.length; i++) {
//             System.out.print(result[i]);
//             if (i < result.length - 1) System.out.print(",");
//         }
//         System.out.println("]");

//         scanner.close();
//     }
// }

// ЗАДАНИЕ 10
// import java.util.Scanner;

// public class odsafmoadmfopadsmfpasdfpasdffpasddmfsam {

//     public static String grade(int score) {
//         if (score < 0 || score > 100) return "Invalid";
//         if (score >= 90) return "A";
//         if (score >= 80) return "B";
//         if (score >= 70) return "C";
//         if (score >= 60) return "D";
//         return "F";
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int score = scanner.nextInt();
//         String result = grade(score);

//         System.out.println(result);

//         scanner.close();
//     }
// }