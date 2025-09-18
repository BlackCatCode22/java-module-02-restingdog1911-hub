import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("enter an animal: ");
        String imputAnimal = imput.nextLine();
        String reversedstring="";


        for(int i = imputAnimal.length() -1;i>=0;i-- ){
            reversedstring = reversedstring + imputAnimal.charAt(i);

        }

        System.out.println(reversedstring);




    }
}