import java.util.Scanner;

public class Prb5_NoteCounter {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        int amount = sc.nextInt();
        if(amount<=0){
            System.out.println("You don't have enough notes in your amount.Please try again.");
        }else {
            System.out.println("Breakdown your notes:");
           for(int note : notes){
               if(note<=amount){
                   int count = amount/note;
                   amount%=note;
                   System.out.println(note+" "+count);
               }
           }
        }
    }
}
