//O factory method geralmente é usado quando você tem 
//algum processamento genérico em uma classe
//mas deseja variar o tipo de fruta que realmente usa.

abstract class FruitPicker {

  protected abstract Fruit makeFruit();

  public void pickFruit() {
    private final Fruit f = makeFruit(); // The fruit we will work on..
    //business rules
  }
}