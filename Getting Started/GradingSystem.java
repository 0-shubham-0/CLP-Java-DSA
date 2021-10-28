/*
    1. You are given as input marks of a student.
    2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.

*/


public class GradingSystem {
    public static void main(String[] args) {
        int marks =80;
        checkMarks(marks);
    }
    static void checkMarks(int a){
        if (a>90){
            System.out.println("Excellent!");
        }
        else if(a>80){
            System.out.println("Good");
        }
        else if(a>70){
            System.out.println("Fair");
        }
        else{
        System.out.println((a>60)?"Meets expectations":"Below par");
        }
    }
}
