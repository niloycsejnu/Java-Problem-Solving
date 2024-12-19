public class Prb12_Discount_Calculator {
    public static void main(String[] args) {
        String description = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        String numericData = description.replaceAll("[^\\d]", " ");
        numericData = numericData.trim();
        numericData = numericData.replaceAll(" +", " ");
        String[] numbersArray = numericData.split(" ");

        int laptopCost = Integer.parseInt(numbersArray[1]);
        int mouseCost = Integer.parseInt(numbersArray[2]);
        int mouseCount = Integer.parseInt(numbersArray[3]);
        int discountRate = Integer.parseInt(numbersArray[4]);

        int totalCostBeforeDiscount = (laptopCost + (mouseCost * mouseCount));
        Double discountAmount = totalCostBeforeDiscount * (discountRate / 100.0);
        double finalCost = totalCostBeforeDiscount - discountAmount;

        System.out.println("Total cost after discount is " + finalCost + " tk");
    }
}
