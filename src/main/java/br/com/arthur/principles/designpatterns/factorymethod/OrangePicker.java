//Você pode reutilizar a funcionalidade 
//comum em FruitPicker.pickFruit() implementando 
//um método de fábrica em subclasses:

class OrangePicker extends FruitPicker {

  @Override
  protected Fruit makeFruit() {
    return new Orange();
  }
}