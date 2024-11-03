import java.util.Scanner;
//Polindrom eded
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println(number);
        }else{
            System.out.println(number*2);
        }



}}