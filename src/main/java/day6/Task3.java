package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Анна Генадьевна", "Ракетостроение");
        Student student1 = new Student("Васек");
        teacher1.evaluate(student1);
    }
}
