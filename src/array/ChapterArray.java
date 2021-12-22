package array;

public class ChapterArray {
    public static void main(String[] args) {

        char alphabet[] = new char[26];

        int A = 65;

        for (int i = 0 ; i <alphabet.length ; i++ ) {

            alphabet[i] = (char)A;
            A++;
        }
        for (int i = 0 ; i < alphabet.length ; i++) {
            System.out.println(alphabet[i]);
        }
    }
}

// 형 변환  -> (char)x, (int)x 등 바꾸고자하는 형을 앞에 괄호로 붙여준다.