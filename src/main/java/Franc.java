public class Franc extends Money {
    public Franc(Double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(float factor) {
        return new Franc(this.amount * factor, this.currency);
    }

}
