public class savingsAccountPlus extends savingAccount {
    // final - não poderá ser sobreposto após aqui...
    @Override
    public final void withdraw(double amount) {
        balance -= amount + 2.0;
    }
}
