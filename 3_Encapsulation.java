// 3 ENCAPSULATION
//TASK: create a bankaccount class with pvt attributes :accnum and balance
// getter method: getBalance()
//setter methods: deposit() , withdraw()

class BankAccount{
    private String accountnum;
    private double balance;
// constructor to initialise
public BankAccount(String accnum,double bal){
    this.accountnum =accnum;
    this.balance =bal;
}
//getter
public double getBalance(){
    return balance;
}
//setter deposit()
public void deposit(double amount){
if(amount>0){
    balance+=amount;
    System.out.println("deposited: " + amount);

}else{
    System.out.println("Invalid deposit amt");;
}
}
//setter withdraw()
public void withdraw(double amount)
{
    if (amount>0 && amount<=balance){
        balance-=amount;
        System.out.println("withdrew : "+ amount);

    }
    else{ 
        System.out.println("Can't withdraw! "+amount+" Insufficient balance or invalid amount.");

    }
}

public class Encapsulation {
    public static void main(String [] args){
        BankAccount myBank =new BankAccount("123456789",1000);
        System.out.println("current balance : "+ myBank.getBalance());

        myBank.deposit(400);
        System.out.println("New balance after deposit: "+ myBank.getBalance());

        myBank.withdraw(200);
        System.out.println("New balance after withdraw : "+ myBank.getBalance());
        
        myBank.withdraw(120000);


    }
}
}
