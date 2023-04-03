import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    //숫자의 합 구하기
    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (char c : cNum) {
            sum += (c - 48);
        }

        System.out.println(sum);
    }

    //평균 구하기
    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int kinds = sc.nextInt();
        int[] scores = new int[kinds];


        for (int i = 0; i < kinds; i++) {
            scores[i] = sc.nextInt();
        }
        long maxScore = 0;
        long sum = 0;
        for (int score : scores) {
            if (maxScore < score) maxScore = score;
            sum += score;
        }

        System.out.println((sum * 100.0) / maxScore / kinds);


    }

    //구간합 구하기 1
    public static void solution3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataNum = Integer.parseInt(stringTokenizer.nextToken());
        int queryNum = Integer.parseInt(stringTokenizer.nextToken());
        long[] answer = new long[queryNum];
        long[] sumNum = new long[dataNum+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= dataNum; i++) {
            sumNum[i] = sumNum[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < queryNum; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int fIdx = Integer.parseInt(stringTokenizer.nextToken());
            int rIdx = Integer.parseInt(stringTokenizer.nextToken());
            answer[i] = sumNum[rIdx]- sumNum[fIdx-1];
        }
        for (long l : answer) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) throws IOException {
        //solution1();
        solution3();
    }
}

