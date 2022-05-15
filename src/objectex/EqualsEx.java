package objectex;


import java.util.Objects;

class Student{

    int studentID;
    String name;

    Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Student)) return false;

        Student student = (Student) o;
        return studentID == student.studentID;
    }
}

public class EqualsEx {

    public static void main(String[] args){

        Student student1 = new Student(1000, "seongkyu");
        Student student2 = new Student(1000, "seongkyu");

        // equals를 Student 클래스에 학번이 같은 경우 같다고 할지, 이름도 같아야 같다고 할지등을 재정의 해주어야합니다.
        // 재정의 해주지 않으면 메모리 주소를 비교하여 인스턴스가 동일한지를 판단합니다. (Object 클래스에 equals가 그렇게 구현되어 되어있음.)
        // String 타입의 값끼리 비교할 때 equals를 사용하면 서로 일치하는지 비교하는 이유는 String class에 재정의가 되어있기 때문입니다.
        System.out.println(student1.equals(student2));

    }
}
