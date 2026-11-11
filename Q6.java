
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class AccountBean {
    private double balance;

    private PropertyChangeSupport support =
        new PropertyChangeSupport(this);

    public void addPropertyChangeListener(
        PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setBalance(double balance) {
        double oldBalance = this.balance;
        this.balance = balance;

        support.firePropertyChange(
            "balance", oldBalance, balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener(event -> {
            System.out.println("Balance changed!");
            System.out.println("Old Balance: " + event.getOldValue());
            System.out.println("New Balance: " + event.getNewValue());
        });

        account.setBalance(5000);
        account.setBalance(8000);
    }
}
