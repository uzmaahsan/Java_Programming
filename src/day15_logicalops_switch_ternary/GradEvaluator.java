package day15_logicalops_switch_ternary;

public class GradEvaluator {
    public static void main(String[] args) {
        char grade = 'D';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("pass. with grade -" + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake.grade-" + grade);

        }else if(grade=='E'){
            System.out.println("Fail.grade -" + grade);
        }else{
            System.out.println("invilid grade -" + grade);
        }
    }
}