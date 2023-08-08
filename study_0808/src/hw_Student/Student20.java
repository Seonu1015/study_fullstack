package hw_Student;

public class Student20 extends Student {
	
    private static int studentNumberInit = 20000000;
    private static int count = 1;
    
    private int studentNumber;
	
    Student20(String name, int age, String major) {
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
