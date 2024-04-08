package sinav;

public class testing {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        auto.setColor("red");
        auto.setMaxWeight(5);
        auto.setYear(2010);
        System.out.println("Цвет машины: "+ auto.getColor());
        System.out.println("Максимальный вес: "+ auto.getMaxWeight()+" т");
        System.out.println("Год выпуска: "+ auto.getYear());
        auto.move();
        auto.move("на учебу");

        System.out.println("------------------");

        Car cars = new Car();

        cars.setColor("Синий");
        cars.setMaxWeight(4);
        cars.setYear(2000);
        cars.setMaxPersons(7);
        System.out.println("Цвет машины: "+ cars.getColor());
        System.out.println("Максимальный вес: "+ cars.getMaxWeight()+" т");
        System.out.println("Год выпуска: "+ cars.getYear());
        System.out.println("Вместительность пассажиров: "+ cars.getMaxPersons());

        cars.move();
        cars.move("к семье");
        System.out.println("--------------------");

        Truck trucks = new Truck();

        trucks.setColor("Черный");
        trucks.setMaxWeight(7);
        trucks.setYear(2002);
        trucks.setPurpose("Перевозка камней");
        System.out.println("Цвет грузовика: "+ trucks.getColor());
        System.out.println("Максимальный вес: "+ trucks.getMaxWeight());
        System.out.println("Год выпуска: "+ trucks.getYear());
        System.out.println("Цель:" + trucks.getPurpose() );

        trucks.move();
        trucks.move("на работу");
    }

}
