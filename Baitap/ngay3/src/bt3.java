import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int hundred = h.nextInt();
        Scanner t = new Scanner(System.in);
        int tens = t.nextInt();
        Scanner o = new Scanner(System.in);
        int ones = o.nextInt();
        if (ones < 10 && ones >= 0) {
            switch (ones) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        if (tens = ){
        }
        else {
            System.out.println("out of ability");
        }
    }
}
