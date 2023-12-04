class Account {
    private int accountNumber;
    private double balance;
    private double limit;

    public Account(int accountNumber, double initialBalance, double limit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.limit = limit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= -limit) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or limit exceeded.");
        }
    }

    public void transfer(Account toAccount, double amount) {
        if (balance - amount >= -limit) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or limit exceeded.");
        }
    }
}