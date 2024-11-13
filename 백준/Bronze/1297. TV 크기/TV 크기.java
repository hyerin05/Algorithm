import java.util.Scanner;

/*

티비 대각선 길이, 높이, 너비 비율 -> 실제 크기로 출력
대각선 : D
높이 : H
너비 : W
2. H W
피타고라스 정리 : D^2 = H^2 + W^2
 */
public class Main {
    public static void main(String[] args) {

        int D = 0;
        int H = 0;
        int W = 0;

        Scanner sc = new Scanner(System.in);

        D = sc.nextInt();
        H = sc.nextInt();
        W = sc.nextInt();

        double ans = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));
        System.out.println((int)Math.floor(ans*H) + " " + (int)Math.floor(ans*W));
     //   System.out.println((int)Math.sqrt(ans*W));

        }
    }
