
import java.util.Scanner;

public class Bank {
    private double balance;
    private double rate;

    public Bank(double balance,double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest(){
        double annualInterestRate = rate;
        double interest = 0d;
        interest = balance * (annualInterestRate / 1200);
        return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập balance :");
        double balance = sc.nextDouble();
        System.out.println("Nhập annual Interest Rate :");
        double rate = sc.nextDouble();
        Bank bank = new Bank(balance,rate);
        System.out.println("Lãi của bạn = " + (float)bank.calculateInterest() +" $");
    }
}
