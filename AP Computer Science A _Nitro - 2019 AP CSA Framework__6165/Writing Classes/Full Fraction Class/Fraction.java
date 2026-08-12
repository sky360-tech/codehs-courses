public class Fraction

{

public int numerator;

public int denominator;

public Fraction(int n, int d)

{

this.numerator = n;

this.denominator = d;

}

public int getNumerator()

{

return this.numerator;

}

public int getDenominator()

{

return this.denominator;

}

public void setNumerator(int x)

{

this.numerator = x;

}

public void setDenominator(int x)

{

this.denominator = x;

}

public void add(Fraction other)

{

this.numerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;

this.denominator *= other.getDenominator();

}

public void subtract(Fraction other)

{

this.numerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;

this.denominator *= other.getDenominator();

}

public void multiply(Fraction other)

{

this.numerator *= other.getNumerator();

this.denominator *= other.getDenominator();

}

public String toString()

{

return this.numerator + " / " + this.denominator;

}

}// reviewed: 2026-08-12
