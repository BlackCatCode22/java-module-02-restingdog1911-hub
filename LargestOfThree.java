import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner imput=new Scanner(System.in);

        System.out.println("please enter three numbers");

        Integer beefTaco = imput.nextInt();
        Integer chickenTaco = imput.nextInt();
        Integer cheeseTaco = imput.nextInt();

        if (beefTaco > chickenTaco) {
            if (cheeseTaco > beefTaco) {
                System.out.println("the cheesetaco is greater than all");
            } else {
                System.out.println("the beeftaco is greater than all");
            }
        } else if (chickenTaco < cheeseTaco) {
            System.out.println("the cheesetaco is greater than all");
        } else {
            System.out.println("the chickentaco is greater than all");
        }

    }
}
