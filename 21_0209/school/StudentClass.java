package school;

import java.util.Arrays;

public class StudentClass {
    private String name;
    private Student[] students = new Student[0];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // public void addStudentList(Student[] students) {
    //     int length = this.students.length + students.length;
    //     Student[] temp = Arrays.copyOf(this.students, length);
    //     for (int i = 0; i < students.length; i++) {
    //         temp[this.students.length + i] = students[i];
    //     }
    //     this.students = temp;
    // }

    public double classKorAVG() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getKorScore();
        }
        return sum / students.length;
    }

    public double classMatAVG() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getMatScore();
        }
        return sum / students.length;
    }

    public double classEngAVG() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getEngScore();
        }
        return sum / students.length;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void addStudent(String name, int korSorce, int matScore, int engScore) {
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        this.students[this.students.length - 1] = new Student(name, korSorce, matScore, engScore);
    }
}

