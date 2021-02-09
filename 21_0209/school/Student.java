package school;

public class Student {
    private String name;

    private int korScore;
    private int matScore;
    private int engScore;
    
    public Student(String name, int korScore, int matScore, int engScore) {
        this.name = name;
        this.korScore = korScore;
        this.matScore = matScore;
        this.engScore = engScore;
    }

    public String getName() {
        return this.name;
    }

    public int getKorScore() {
        return this.korScore;
    }

    public int getMatScore() {
        return this.matScore;
    }

    public int getEngScore() {
        return this.engScore;
    }

    public double getAvg() {
        return (double) (this.korScore + this.matScore + this.engScore) / 3;
    }
}
