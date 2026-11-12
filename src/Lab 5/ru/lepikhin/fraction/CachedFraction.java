package ru.lepikhin.fraction;


public class CachedFraction extends Fraction {
    private Double cache = null;
    private int computeCount = 0;

    public CachedFraction(int numerator, int denominator) {
        super(numerator, denominator);
    }

    @Override
    public double doubleValue() {
        if (cache == null) {
            cache = super.doubleValue();
            computeCount++;
        }

        return cache;
    }

    @Override
    public void set(int numerator, int denominator) {
        super.set(numerator, denominator);
        cache = null;
        computeCount = 0;
    }

    public int getComputeCount() {
        return computeCount;
    }

    @Override
    public String toString() {
        return "кэшированная дробь " + super.toString();
    }
}