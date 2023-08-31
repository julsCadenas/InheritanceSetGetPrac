package inheritancesetgetprac;
public class NewClassPractice {
    double balance,deposit,withdraw;

    void transactionList() {
        System.out.println("[A] Balance Inquiry\t[B] Withdraw\n[C] Deposit\t\t[D] Exit");
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setDeposit(double deposit) {
        this.deposit=deposit;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw=withdraw;
    }

    public double getWithdraw() {
        return withdraw;
    }
    
    
}
