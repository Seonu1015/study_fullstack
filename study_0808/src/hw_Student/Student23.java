package hw_Student;

public class Student23 extends Student {

    private static int studentNumberInit = 23000000;
    private int studentNumber;
    private static int count = 1;
	
    Student23(String name, int age, String major) {
        super(name, age, major);
        this.studentNumber = setStudentNum();
    }
	
    int setStudentNum() {
        int currentStudentNumber = studentNumberInit + this.getMajorNum()+ count;
        count++;
        return currentStudentNumber;
    }
   
    @Override
    void studentInfo() {
        System.out.println("학번 : " + studentNumber);
        System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
    }
}
