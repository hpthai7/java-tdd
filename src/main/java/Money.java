public class Money {

    protected double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public Money times(float factor) {
        return new Money(factor * this.getAmount());
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        return this.amount == ((Money) obj).amount;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.amount);
    }

}
