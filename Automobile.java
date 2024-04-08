package sinav;

public class Automobile {
    private String color;

    public void colorCar(){ System.out.println("Цвет машины"); }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }


    private int maxWeight;
    public void maxWeight() { System.out.println("Максимальная ширина");}
    public int getMaxWeight() {return maxWeight; }
    public void setMaxWeight (int maxWeight) {this.maxWeight = maxWeight;}

    private int year;
    public void year() { System.out.println("Год выпуска");}
    public int getYear() {return year; }
    public void setYear (int year) {this.year = year;}


    public void move(){ System.out.println("Бара жаткан багыты");}
    public void move(String destination) {
        System.out.println("Направление " + destination);
    }


}


