public class Franc extends Money {
    public Franc(Double amount) {
        super(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Franc)) {
            return false;
        }
        return this.amount == ((Franc) obj).amount;
    }

}
