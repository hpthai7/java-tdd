public class Money {

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

    public Money times(float factor) {
        return new Money(factor * this.getAmount(), this.currency);
    }

    public Money plus(Money money) throws Exception {
        return new Money(this.amount + money.getAmount(), this.currency);
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
