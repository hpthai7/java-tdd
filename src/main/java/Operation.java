public interface Operation {
    Operation plus(Money addend);

    Operation times(float factor);
}
