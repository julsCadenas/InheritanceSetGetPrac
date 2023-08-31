package inheritancesetgetprac;
import java.util.Scanner;
public class NewClassPractice2 extends NewClassPractice{
    NewClassPractice method;

    public NewClassPractice2(NewClassPractice method) {
        this.method=method;
    }

    public String mainTransac(String choice,double withdraw,double deposit,Scanner in,String loop,NewClassPractice method) {
        double balance=method.getBalance();
        System.out.print("\nWhat do you want to do? ");
        choice=in.next();

        switch(choice) {
            case"A":
                System.out.print("Your balance is: "+balance);
                break;
            case"B":
                System.out.println("Your current balance is: "+balance);
                System.out.print("Withdraw amount: ");
                method.setWithdraw(in.nextDouble());
                withdraw=method.getWithdraw();
                balance-=withdraw;
                System.out.println("Your new balance is " + balance);
                method.setBalance(balance);
                break;
            case"C":
                System.out.println("Your current balance is: "+balance);
                System.out.print("Deposit amount: ");
                method.setDeposit(in.nextDouble());
                deposit=method.getDeposit();
                balance+=deposit;
                System.out.println("Your new balance is: " + balance);
                method.setBalance(balance);
                break;
            case"D":
                System.out.println("You have exited. Thank you!");
                loop="N";
                break;
            default:
                System.out.println("INVALID TRANSACTION");
                break;
        }
        return loop;
    }
   
    
}


