import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        int p; //선수
        int cnt [] = new int[26]; //알파벳
        Scanner sc = new Scanner(System.in);

        p = sc.nextInt();


        /*첫 글자가 같은 선수 5명을 뽑아야함
          5명이 안 될 떄 PREDAJA 나오게 해야함
        */

        for (int i = 0; i <p; i++) {
            String word = sc.next();
            char c = word.charAt(0); // 첫번째 문자의 아스키코드(int형) 반환
            cnt[c - 'a'] ++ ;
        }


        String result = "";
        // 알파벳 갯수만큼 순회
        for (int i = 0; i < 26; i++) {
            if (cnt[i] >= 5) { // 카운팅된 알파벳 배열의 해당 인덱스가 5 이상일때
                // 해당 알파벳 인덱스 = i
                // 인덱스에 해당하는 알파벳
                // ex) a == 97
                //     i == 0
                // 찾은 인덱스 + 디폴트 문자값 아스키코드 'a'(int로 97)를 아스키코드로 변환 int -> char
                // 변환된 아스키코드를 String으로 변환하여 result에 더해준다.
//                result += i + 'a';
                result += (char) (i + 97);
            }
        }

        if (result == "") {
            result = "PREDAJA";
        }

        System.out.println(result);
    }
}
