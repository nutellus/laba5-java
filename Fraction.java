public class Fraction implements Fractionable {
    private int numerator;
    private int denominator;
    private Double cachedValue; // кэш для вещественного значения

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    @Override
    public double toDouble() {
        if (cachedValue == null) {
            cachedValue = (double) numerator / denominator;
        }
        return cachedValue;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        cachedValue = null; // сбрасываем кэш
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator <= 0)
            throw new IllegalArgumentException("Знаменатель должен быть положительным");
        this.denominator = denominator;
        cachedValue = null; // сбрасываем кэш
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return numerator == other.numerator && denominator == other.denominator;
    }
}
