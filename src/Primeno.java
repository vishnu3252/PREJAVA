
public class Primeno {

	public static void main(String[] args) {
		int num=39;
		int count_of_Factors=0;
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				 count_of_Factors=count_of_Factors+1;
			}
		}
			if(count_of_Factors==2) {
				System.out.println("number is Prime");
			}else {
				System.out.print("number is not Prime");
			}

	}

}
