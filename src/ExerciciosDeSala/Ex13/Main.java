package ExerciciosDeSala.Ex13;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Conta account1 = new Conta("Jane Green", BigDecimal.valueOf(50.00));
        Conta account2 = new Conta("John Blue", BigDecimal.valueOf(-7.53));


        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        BigDecimal depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);


        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);


        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
