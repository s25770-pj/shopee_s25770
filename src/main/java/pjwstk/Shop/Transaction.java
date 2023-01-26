package pjwstk.Shop;

public class Transaction {
    private double value;
    private String status;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction(double value, String status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "value=" + value +
                ", status='" + status + '\'' +
                '}';
    }
}
