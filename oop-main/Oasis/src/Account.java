import java.util.ArrayList;

/**
 * balance: so du.
 * arraylist theo doi nap, rut
 */
public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * nap.
     */
    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        } else {
            this.balance += amount;
        }
    }

    /**
     * Rut.
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        } else {
            this.balance -= amount;
        }
    }

    /**
     * thao tac.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * in.
     */
    public void printTransaction() {
        int leng = transitionList.size();
        int cnt = 1;
        for (int i = 0; i < leng; i++) {
            if (transitionList.get(i).getOperation().equals("deposit")) {
                System.out.println("Giao dich " + cnt + ": " + "Nap tien " + "$"
                        + String.format("%.2f", Math.round(
                        transitionList.get(i).getAmount() * 100.0) / 100.0)
                        + ". So du luc nay: $"
                        + String.format("%.2f", transitionList.get(i).getBalance()) + ".");
            } else {
                System.out.println("Giao dich " + cnt + ": " + "Rut tien " + "$"
                        + String.format("%.2f", transitionList.get(i).getAmount())
                        + ". So du luc nay: $"
                        + String.format("%.2f", transitionList.get(i).getBalance()) + ".");
            }
            cnt++;
        }
    }
}
