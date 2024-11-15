import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String word;
        int cnt[] = new int[26];
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) { // 사용자가 입력을 종료할 때까지
            // hasNext() : 공백이나 줄바꿈을 기준으로 한 단어 체크
            // hasNextLine() : 한 줄 전체가 있는지 확인
            word = sc.nextLine();

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                    cnt[word.charAt(i) - 'a'] ++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, cnt[i]);
        }

        for (int i = 0 ; i < 26; i++) {
            if (cnt[i] == max) {
                System.out.print((char) ('a' + i));
            }
        }
        
        sc.close();

    }
}