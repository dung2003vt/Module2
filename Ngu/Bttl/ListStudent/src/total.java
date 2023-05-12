import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        System.out.println("Nhập số học sinh");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Studen [] studens = new Studen[num];
        for ( int i= 0;i < num; i++) {
            studens[i] = Studen.studen();
        }


//        Studen studen1 = new Studen("Lam",21,6,10,7);
//        Studen studen2 = new Studen("Thai",20,10,9,9);
//        Studen studen3 = new Studen("Duc",29,6,7,8);
//        studens[0] = studen1;
//        studens[1] = studen2;
//        studens[2] = studen3;
        double max = (studens[0].getMath() + studens[0].getPhysical()+studens[0].getChemistry())/3;
        int index = 0;
        for (int i = 0; i < studens.length; i++){
            if (((studens[i].getMath() + studens[i].getPhysical()+studens[i].getChemistry())/3) > max ){
                index = i ;
            }
        }
        System.out.println(studens[index]);
    }
}
