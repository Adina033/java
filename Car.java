package sinav;

 class Car extends Automobile{

@Override
public void move(){
 System.out.println("Бара жаткан багыт уй");
}


  private String color;
  public void colorCar(){ System.out.println("Цвет машины"); }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }

  private int maxWeight;
  public void maxWeight() { System.out.println("Максимальный вес");}
  public int getMaxWeight() {return maxWeight; }
  public void setMaxWeight (int maxWeight) {this.maxWeight = maxWeight;}

  private int year;
  public void year() { System.out.println("Год выпуска");}
  public int getYear() {return year; }
  public void setYear (int year) {this.year = year;}


  private int maxPersons;
  public void maxPersons() { System.out.println("Вместительность пассажиров");}
  public int getMaxPersons() {return maxPersons; }
  public void setMaxPersons (int maxPersons) {this.maxPersons = maxPersons;}


}

