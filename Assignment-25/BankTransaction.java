class BankAccount{
    private int balance=10000;
    synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit:   $" + amount + " | Balance: $"+balance);
    }
    synchronized void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawal: $"+amount+" | Balance: $"+balance);
        }
        else{
            System.out.println("Withdrawal: $"+amount+" | Insufficient Balance");
        }
    }
}
class DepositThread extends Thread{
    BankAccount account;
    DepositThread(BankAccount account){
        this.account=account;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            account.deposit(1000);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class WithdrawalThread extends Thread{
    BankAccount account;

    WithdrawalThread(BankAccount account){
        this.account=account;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            account.withdraw(800);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class BankTransaction{
    public static void main(String[] args){
        BankAccount account=new BankAccount();

        DepositThread deposit=new DepositThread(account);
        WithdrawalThread withdrawal=new WithdrawalThread(account);

        deposit.start();
        withdrawal.start();
    }
}