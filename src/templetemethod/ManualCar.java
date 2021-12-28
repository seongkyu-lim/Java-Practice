package templetemethod;

public class ManualCar extends Car{

    @Override
    public void drive(){
        System.out.println("차를 직접 주행합니다.");
    }

    @Override
    public void stop(){
        System.out.println("직접 차를 세웁니다.");
    }
}
