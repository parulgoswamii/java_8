
import java.beans.PropertyChangeSupport;

class AccountEventDemo {
    private double balance = 1000;

    private PropertyChangeSupport support =
        new PropertyChangeSupport(this);

    public void setBalance(double newBalance) {
        double oldBalance = balance;
        balance = newBalance;

        support.firePropertyChange(
            "balance", oldBalance, newBalance);
    }

    public void addListener(
        java.beans.PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        AccountEventDemo account = new AccountEventDemo();

        account.addListener(event -> {
            System.out.println("Property: " + event.getPropertyName());
            System.out.println("Old Value: " + event.getOldValue());
            System.out.println("New Value: " + event.getNewValue());
        });

        account.setBalance(5000);
    }
}
