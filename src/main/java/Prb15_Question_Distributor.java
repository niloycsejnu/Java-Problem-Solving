public class Prb15_Question_Distributor {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;
        int fiveMarksQuestions = 0;
        int tenMarksQuestions = 0;

        for (fiveMarksQuestions = 0; fiveMarksQuestions <= totalQuestions; fiveMarksQuestions++) {
            tenMarksQuestions = totalQuestions - fiveMarksQuestions;
            if ((fiveMarksQuestions * 5) + (tenMarksQuestions * 10) == totalMarks) {
                break;
            }
        }
        System.out.println("5 marks question is " + fiveMarksQuestions);
        System.out.println("10 marks question is " + tenMarksQuestions);
    }
}
