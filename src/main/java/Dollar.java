public class Dollar extends Money {
    public Dollar(Double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(float factor) {
        return new Dollar(this.amount * factor, this.currency);
    }

}
