import java.util.Scanner;

/*
문자열에 몇 개의 단어가 있는지

1. 문자열 입력
2. 단어 갯수 출력

 */
public class Main {
    public static void main(String[] args) {
        String word;

        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' '){
                cnt++;
            }
        }

        if (word.charAt(0) != ' ' && word.charAt(word.length()-1) != ' ') {
            cnt =  cnt + 1;
        }
        if (word.charAt(0) == ' ' && word.charAt(word.length()-1) == ' ') {
            cnt = cnt - 1;
        }

        System.out.println(cnt);
    }
}
