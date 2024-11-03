import java.util.Scanner;
//Polindrom eded
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = number;
        int terseded=0;
        while(number>0){
            terseded=(number%10)+terseded*10;
            number=number/10;

        }
        String s = terseded == number2 ? "this is polindrom" : "this is not polindrom";
        System.out.println(s);



}}