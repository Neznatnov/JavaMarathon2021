package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human person = new Human("Иван");
        Student student = new Student("Петр", "Группа А");
        Teacher teacher = new Teacher("Василий Сергеевич", "Теория Вероятности");

        person.printInfo();
        student.printInfo();
        teacher.printInfo();
    }
}
