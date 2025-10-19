package lab3;

public class Main {
    public static void main(String[] args) {

        HashTable<String, Student> students = new HashTable<>();

        students.put("1001", new Student("Ivan", "Ivanov", 20, 4.5));
        students.put("1002", new Student("Anna", "Petrova", 19, 4.8));
        students.put("1003", new Student("Petr", "Sidorov", 21, 4.2));

        System.out.println("Student 1001: " + students.get("1001"));

        System.out.println("Total students: " + students.size());

        students.remove("1002");
        System.out.println("After removal, total students: " + students.size());

        Student s = students.get("1002");
        System.out.println("Student 1002: " + (s == null ? "not found" : s));

        students.put("1004", new Student("Elena", "Smirnova", 22, 4.7));
        System.out.println("Student 1004: " + students.get("1004"));
        System.out.println("Total students: " + students.size());
    }
}
