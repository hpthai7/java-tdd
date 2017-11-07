public class Money implements Operation {

    protected double amount;
    protected String currency;

    static Money makeFranc(double amount) {
        return new Franc(amount, "CHF");
    }

    static Money makeDollar(double amount) {
        return new Dollar(amount, "USD");
    }

    public Money(double amount) {
        this(amount, null);
    }

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Operation plus(Money addend) {
        return new Money(this.amount + addend.getAmount(), this.currency);
    }

    @Override
    public Operation times(float factor) {
        return new Money(factor * this.getAmount(), this.currency);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        if (this.currency != ((Money) obj).getCurrency()) {
            return false;
        }
        return this.amount == ((Money) obj).amount;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
