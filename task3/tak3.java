package task3;

import java.util.ArrayList;

// ЗАДАНИЕ 1
// import java.util.Scanner;
// public class tak3 {
//     public static void ReverseString(String str) {
//         String[] words = str.split(" ");
//         for (int i = words.length - 1; i >= 0; i--) {
//             System.out.print(words[i]);
//             if (i > 0) System.out.print(' ');
//         }
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             ReverseString(scanner.nextLine());
//         }
//     }
// }
// ЗАДАНИЕ 2
// import java.util.Scanner;
// public class tak3 {
//     public static void CountVowels(String str) {
//         int count = 0;
//         char[] vowels = {'a', 'i', 'u', 'e', 'o'};
//         str = str.toLowerCase();
//         for (char c : str.toCharArray()) {
//             for (char v : vowels) {
//                 if (c == v) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//         CountVowels(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 3
// import java.util.Scanner;
// import java.util.ArrayList;
// public class tak3 {
//     public static void SecondLargest(String str) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         for (String c : str.replace("[", "").replace("]", "").split(", ")) {
//             nums.add(Integer.parseInt(c));
//         }
//         int maxnum = -9999999;
//         int secondmax = -999999999;
//         for (int num : nums) {
//             if (num > maxnum) {
//                 secondmax = maxnum;
//                 maxnum = num;
//             } else if (num > secondmax) {
//                 secondmax = num;
//             }
//         }
//         System.out.println(secondmax);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//         SecondLargest(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 4
// import java.util.Scanner;
// public class tak3 {
//     public static void sumOfDigits(String str) {
//         int sum = 0;
//         for (char digit : str.toCharArray()) {
//             sum += Character.getNumericValue(digit);
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//         sumOfDigits(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 5
// import java.util.Scanner;
// import java.util.Arrays;
// public class tak3 {
//     public static void isAnagram(String str) {
//         String[] parts = str.split(", ");
//         char[] chars1 = parts[0].toLowerCase().toCharArray();
//         char[] chars2 = parts[1].toLowerCase().toCharArray();
//         Arrays.sort(chars1);
//         Arrays.sort(chars2);
//         String str1 = new String(chars1);
//         String str2 = new String(chars2);
//         System.out.println(str1.equals(str2));
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             isAnagram(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 6
// import java.util.Scanner;
// import java.util.ArrayList;
// public class tak3 {
//     public static void filterEven(String str) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         ArrayList<Integer> even_nums = new ArrayList<>();
// for (String c : str.replace("[", "").replace("]", "").split(", ")) {
//     nums.add(Integer.parseInt(c));
// }
//         for (Integer num : nums) {
//             if (num % 2 == 0) {
//                 even_nums.add(num);
//             }
//         }
//         System.out.println(even_nums);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             filterEven(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 7
// import java.util.Scanner;
// import java.util.ArrayList;
// public class tak3 {
//     public static void countWords(String str) {
//         System.out.println(str.trim().replaceAll("\\s+", " ").split(" ").length);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             countWords(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 8
// import java.util.Scanner;
// import java.util.ArrayList;
// public class tak3 {
//     public static void fibonacci(String str) {
//         int index = Integer.parseInt(str);
//         System.out.println(inner(index));
//     }
//     public static int inner(int index) {
//         switch (index) {
//             case 0:
//                 return 0;
//             case 1:
//                 return 1;
//             default:
//                 return inner(index - 1) + inner(index - 2);
//         }
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             fibonacci(scanner.nextLine());
//         }
//     }
// }
// // ЗАДАНИЕ 9
// import java.util.Scanner;
// import java.util.ArrayList;
// public class tak3 {
//     public static void differenceMaxMin(String str) {
//         ArrayList<Integer> nums = new ArrayList<>();
//         for (String c : str.replace("[", "").replace("]", "").split(", ")) {
//             nums.add(Integer.parseInt(c));
//         }
//         int max = -9999999;
//         int min = 99999999;
//         for (int num : nums) {
//             if (num > max) {
//                 max = num;
//             };
//             if (num < min) {
//                 min = num;
//             };
//         }
//         System.out.println(max - min);
//     }
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             differenceMaxMin(scanner.nextLine());
//         }
//     }
// }
// ЗАДАНИЕ 10
import java.util.Scanner;
import java.util.ArrayList;

public class tak3 {

    public static void isTriangle(String str) {
        String[] parts = str.split(", ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int num3 = Integer.parseInt(parts[2]);
        System.out.println(num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2);

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            isTriangle(scanner.nextLine());
        }
    }
}
