package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래1");
        library[1] = new Book("태백산맥2", "조정래2");
        library[2] = new Book("태백산맥3", "조정래3");
        library[3] = new Book("태백산맥4", "조정래4");
        library[4] = new Book("태백산맥5", "조정래5");

        System.arraycopy(library, 0 , copyLibrary, 0, 5);

        //얕은 복사 : 주소값만 참조해 원본이 변경되면 카피본도 같이 봐낀다.

       /* for (Book book : copyLibrary) {
            book.showBookInfo();
        } */

        library[0].setTitle("나무");
        library[0].setAuthor("박완서");

         for ( Book book : library) {
             book.showBookInfo();
         }
         System.out.println("________________");

         for(Book book : copyLibrary) {
             book.showBookInfo();
         }
    }
}
