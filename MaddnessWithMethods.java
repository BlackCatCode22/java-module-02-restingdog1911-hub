import java.util.Scanner;



public class MaddnessWithMethods {
    public static void main(String[] args){


        System.out.println("please enter 2 numbers");
        Integer num1 = getImput();
        Integer num2 = getImput();

        Integer result= compare(num1,num2);
        Integer sum= calcSum(num1,num2);
        System.out.println(result + "is the bigger number,and their sum is"+ sum);
    }
    public static int getImput(){
        Scanner imput = new Scanner(System.in);
        Integer num = imput.nextInt();

        return num;
    }

    public static int compare(int num1,int num2){

        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static int calcSum(int num1,int num2){

        Integer sum= num1 + num2;
        return sum;

    }
}