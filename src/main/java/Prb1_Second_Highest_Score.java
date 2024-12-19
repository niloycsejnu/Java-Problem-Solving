public class Prb1_Second_Highest_Score {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highestScore = Double.MIN_VALUE;
        double secHighestScore = Double.MIN_VALUE;
        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] > highestScore) {
                secHighestScore = highestScore;
                highestScore = cgpa[i];
            }else if(cgpa[i] > secHighestScore && cgpa[i] < highestScore){
                secHighestScore = cgpa[i];
            }
        }
        System.out.println("The second highest score is " + secHighestScore);
    }
}
