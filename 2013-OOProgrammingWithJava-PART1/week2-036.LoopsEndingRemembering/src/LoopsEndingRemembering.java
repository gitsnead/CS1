import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int Number = 0;
        int Sum = 0;
        int Count = 0;
        int Even = 0;
        int Odd = 0;
        while (Number != -1) {
            Number = Integer.parseInt(reader.nextLine());
            if (Number != -1) {
                Sum += Number;
                Count++;
                if (Number % 2 == 0){
                    Even++;
                } else {
                    Odd++;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + Sum);
        System.out.println("How many numbers: " + Count);
        double Avg = (Sum + 0.0d) / (Count + 0.0d);
        System.out.println("Average: " + Avg);
        System.out.println("Even numbers: " + Even);
        System.out.println("Odd numbers: " + Odd);
    }
}
