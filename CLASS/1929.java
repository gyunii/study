import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        primeNumber(m, n);
    }
    
    //에라토스테네스의 체 이용
    static void primeNumber(int m, int n) {
        int[] ar = new int[n+1];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 2; i <= n; i++) {
            ar[i] = i;
        }
        
        for (int i = 2; i <= n; i++) {

            if (ar[i] == 0) continue;  
            for (int j = i+i; j <= n; j += i) {
                ar[j] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (ar[i] != 0) sb.append(i + "\n");
        }
        System.out.print(sb);
    }