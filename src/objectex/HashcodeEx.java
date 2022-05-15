package objectex;

import java.util.Objects;

class Students{
    int studentID;
    String name;

    Students(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    //일반적으로 hashcode와 equals는 같이 재정의 되어야 논리적 모순이 없음.
    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}

public class HashcodeEx {
    public static void main(String[] args){
        Students student1 = new Students(1000, "seongkyu");
        Students student2 = new Students(1001, "jeongwon");

        // 기본적으로 정의된 hashcode함수는 인스턴스의 메모리주소를 반환함. (hashcode라고 하는 이유는 jvm에서 힙영역에서 인스턴스관리를 해시로 하기 때문.)
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
