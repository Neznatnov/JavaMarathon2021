package day6;

import java.util.Random;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject){
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random r = new Random();
        double grade = r.nextInt(4)+2;
        System.out.println(grade);
        String gradeString;
        if (grade==2){
            gradeString = "неудовлетворительно";
        } else if(grade==3){
            gradeString = "удовлетворительно";
        } else if(grade==4){
            gradeString = "хорошо";
        } else {
            gradeString = "отлично";
        }
        System.out.println("Преподаватель " + nameTeacher +  " оценил студента с именем " + student.getNameStudent() + " по предмету " + subject + " на оценку " +  gradeString);
    }

}
