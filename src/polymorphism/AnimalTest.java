package polymorphism;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 걷는다.");
    }

    public void drinking(){
        System.out.println("벌컥 벌컥.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 걷는다.");
    }

    public void hunting(){
        System.out.println("콱!");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 난다.");
    }

    public void sleeping(){
        System.out.println("쿨쿨!");
    }
}

public class AnimalTest {
    public static void main(String[] args){

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        /**
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
        **/

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        for ( Animal animal : animalArrayList) {
            animal.move();
        }

    }

    // 같은 코드로 다른 것을 수행. -> 다형성
    // 상속은 베이스.
    // 형변환으로 인해 Animal 타입 매개변수로 모두 접근이 가능해졌기 때문.
    // 또한 overriding된 것이기에 상위클래스 타입이어도 접근 가능.
    private void moveAnimal(Animal animal) {
        animal.move();
    }
}
