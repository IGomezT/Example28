import java.util.Scanner;

public class Example28 {
    public static void main(String [] argv) {
        int a;
        int b;
        int suma = 0;
        Scanner inputValue;
        inputValue =new Scanner(System.in);

        System.out.println("primer numero");
        a = inputValue.nextInt();

        System.out.println("Segundo numero");
        b = inputValue.nextInt();


        for (int i = 1; i <= b; i++) {
            suma= suma+a ;

        }
        System.out.println("PROODUCTO : " +suma);


    }
}
