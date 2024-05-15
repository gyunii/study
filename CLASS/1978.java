import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		int n= s.nextInt();
		
		for(int i=0; i<n; i++) {
			
			boolean prime = true;
			
			int num = s.nextInt();
			
			if(num == 1) {
				continue;
			}
			
			for(int j=2; j<num; j++) {
				if(num % j == 0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				count++;
			}
		}
        System.out.println(count);
	  } 

    }

