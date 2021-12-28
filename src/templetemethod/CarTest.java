package templetemethod;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args){
        /**
        Car aicar = new AICar();
        aicar.run();

        System.out.println("---------------");

        Car manualcar = new ManualCar();
        manualcar.run();
        **/

        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(new Sonata());
        carArrayList.add(new Genesis());
        carArrayList.add(new Grandeur());
        carArrayList.add(new Avante());

        for(Car car: carArrayList){
            car.run();
            System.out.println("=================");
        }
    }
}
