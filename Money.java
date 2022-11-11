/**
 * The interface demonstrates three methods
 * 1. To add the money using a Money Object and other object and returns a Money Object
 * 2. To add the money with the parameters int types and the method throws IllegalArgumentException
 * 3. To get the decimal value of the money
 */

public interface Money {

  public Money add(Money other);

  public Money add(int dollar, int cent);

  public double getDecimalValue();
}


