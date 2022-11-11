
/**
 * SimpleMoney has the following methods :
 * 1.getdollars()
 * 2.getCents()
 * 3.add methods with different parameters
 * 4.To get the decimal value
 * 5.To convert the decimal value to string.
 */

public class SimpleMoney implements Money {
  private double dollars = 0;
  private double cents = 0;

  public double getDollars() {
    return this.dollars;
  }

  public double getCents() {
    return this.cents;
  }

  public SimpleMoney(int dollars,int cents) throws IllegalArgumentException
  {
    if(dollars < 0 || cents < 0){
      throw new IllegalArgumentException("Please provide the right values");
    }
    this.dollars = (double)dollars;
    this.cents = (double)cents ;
    //this.dollars=Math.round(this.dollars*100)/100;
    //this.cents=Math.round(this.cents*100)/100;
  }


  @Override
  public Money add(int dollarsI, int centsI) throws IllegalArgumentException
  {
    if(dollarsI < 0 || centsI < 0){
      throw new IllegalArgumentException("Please enter the right values");
    }

    this.dollars = this.dollars + dollarsI;
    this.cents = this.cents + centsI;
    return this;

  }

  @Override
  public Money add(Money other) throws IllegalArgumentException {
    this.dollars = ((SimpleMoney) other).dollars;
    this.cents = ((SimpleMoney) other).cents;
    this.dollars = this.dollars + dollars;
    this.cents = this.cents + cents;
    return this;
  }

  @Override
  public double getDecimalValue() {
    return this.dollars + (double)this.cents / 100;
  }

  public String toString() {
    return String.format("$%.2f", getDecimalValue());
  }
}
