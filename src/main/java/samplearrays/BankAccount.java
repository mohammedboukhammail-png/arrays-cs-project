package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        int n = transactions.length;
        if(amount>0){
            for(int i=0;i<n;i++){ 
                if (transactions[i]==0){ 
                    transactions[i]=amount;
                    break;
                }
            }
            currentBalance+=amount;
            System.out.println(name + "deposited" + amount + "\n current balance is:"+currentBalance);
        }
        else{ System.out.println("Error");}

    }

    public void withdraw(double amount){
        if( amount <= currentBalance){
            currentBalance-=amount;
            int n = transactions.length;
            if(amount>0){
                for(int i=0;i<n;i++){ 
                    if (transactions[i]==0){ 
                        transactions[i]=(-amount);
                        break;
                    }
                }
            }
        }
        else{System.out.println("Error");}       
    }            

    public void displayTransactions(){
        int n = transactions.length;
        for(int i=0;i<n;i++){
            if(transactions[i] !=0){
                System.out.println(transactions[i]);
            }
        }

    }

    public void displayBalance(){
        System.out.println(currentBalance);

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
