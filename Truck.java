package sinav;

 class Truck extends Automobile{

  @Override
  public void move(){
   System.out.println("Бара жаткан багыт стройка");
  }
  public String color;
  public void colorCar(){ System.out.println("Цвет грузовика"); }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }
  public int maxWeight;
  public void maxWeight() { System.out.println("Максимальный вес грузовика");}
  public int getMaxWeight() {return maxWeight; }
  public void setMaxWeight (int maxWeight) {this.maxWeight = maxWeight;}
  public int year;
  public void year() { System.out.println("Год выпуска");}
  public int getYear() {return year; }
  public void setYear (int year) {this.year = year;}
  public String purpose;
  public void purpose() {System.out.println("Цель");}
  public String getPurpose() {return purpose;}
  public void setPurpose(String purpose) {this.purpose = purpose;}

}
