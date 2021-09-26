
public class CountDigit {

	public static void main(String[] args) {
		int num=584214254;
		int count=0;
		if(num==0) {
			System.out.println(0);
			
		}else {
			for(int i=num;i>0;i=i/10)
				count++;
		}
		System.out.print("number of digit is"+count);
	}

}
