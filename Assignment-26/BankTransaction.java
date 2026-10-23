class BankAccount{
    int balance=1000;
    synchronized void deposit(int amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" deposited Rs. "+amount);
        System.out.println("Current Balance: Rs. "+balance);
    }
    synchronized void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" withdrew Rs. "+amount);
            System.out.println("Current Balance: Rs. "+balance);
        }
        else{
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
class DepositTask implements Runnable{
    BankAccount account;
    DepositTask(BankAccount account){
        this.account=account;
    }
    public void run(){
        account.deposit(500);
    }
}
class WithdrawalTask implements Runnable{
    BankAccount account;
    WithdrawalTask(BankAccount account){
        this.account=account;
    }
    public void run(){
        account.withdraw(300);
    }
}
public class BankTransaction{
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        Thread t1=new Thread(new DepositTask(account),"Deposit Thread");
        Thread t2=new Thread(new WithdrawalTask(account),"Withdrawal Thread");
        t1.start();
        t2.start();
    }
}