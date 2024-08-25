public class EvenNumPrinterV2 {

    public static int printEvenNums(int num) {
        int steps = 0;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num+=2 ;
            steps++;;
        }
        System.out.println("Steps: " + steps);
        return num;
    }

    public static void main(String[] args){
        int num = 2;
        printEvenNums(num);
    }
}