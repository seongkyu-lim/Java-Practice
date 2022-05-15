package objectex;


class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class ToStringEx {

    public static void main(String[] args){

        Book book = new Book("hi", "seongkyu");

        // Book 클래스에 toString을 재정의하지 않을 경우, 클래스위치 + @ + 인스턴스 해쉬코드 값 (인스턴스의 힙영역 메모리 주소) 가 추력됩니다.
        System.out.println(book);

    }
}
