public class aula24 {
    public static void main(String[] args) {

        account2 acc = new account2(1000, "joas", 0.0);
        businessAccount bacc = new businessAccount(1001, "vitor", 0.0, 500.0);

        account2 acc6 = new account2(100, "alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        account2 acc7 = new savingAccount(10000, "junior", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        account2 acc8 = new businessAccount(1100, "bruno", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        // upcasting

        account2 acc1 = bacc;
        account2 acc2 = new businessAccount(1000, "joas", 0.0, 100.0);
        account2 acc3 = new savingAccount(1004, "ana", 0.5, 0.05);

        // downcasting

        businessAccount acc4 = (businessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof businessAccount) {
            businessAccount acc5 = (businessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof savingAccount) {
            savingAccount acc5 = (savingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
