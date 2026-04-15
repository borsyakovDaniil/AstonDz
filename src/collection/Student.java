package collection;

public class Student {

    String name;
    int group;
    int course;
    int estimation;

    public Student(String name, int group, int course, int estimation) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.estimation = estimation;
    }

    public int getEstimation() {
        return estimation;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public void promote() {
        if (this.course < 5) {
            this.course++;
            System.out.println("Студент " + this.name + " переведен на " + this.course + " курс ");
        } else {
            System.out.println("Студент " + this.name + " уже на выпускном курсе!");
        }
    }

}


