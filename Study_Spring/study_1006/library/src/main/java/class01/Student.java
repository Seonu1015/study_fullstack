package class01;

public class Student {
	private String studName;
	private int english;
	private int math;
	private int science;
	private int totalScore;
	private int avgScore;
	
	public Student(String studName, int english, int math, int science) {
		this.studName = studName;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
    public String getName() {
        return studName;
    }

    public void setName(String studName) {
        this.studName = studName;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
    
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
    
    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public int getAvgScore() {
        return avgScore;
    }
}
