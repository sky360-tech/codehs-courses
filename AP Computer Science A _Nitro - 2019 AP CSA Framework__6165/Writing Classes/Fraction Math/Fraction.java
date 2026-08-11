public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator() {
        return this.numerator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    /**
    \* Updates this fraction by adding another fraction
    \* u/param other Fraction to add to existing fraction
    \*/
    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    
    public void addFraction(Fraction other){
        Fraction res = FractionMath.add(this, other);
        this.setNumerator(res.getNumerator());
        this.setDenominator(res.getDenominator());
    }
    
    /**
    \* Updates this fraction by multiplying another fraction
    \* u/param other Fraction to multiple to existing fraction
    \*/
    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    
    public void multiplyFraction(Fraction other){
        Fraction res = FractionMath.multiply(this, other);
        this.setNumerator(res.getNumerator());
        this.setDenominator(res.getDenominator());
    }
    
    /**
    \* Prints fraction as numerator / denominator
    \* Example: 1 / 2
    \*/
    
    public String toString(){
        return numerator + " / " + denominator;
    }
}// reviewed: 2026-08-11
