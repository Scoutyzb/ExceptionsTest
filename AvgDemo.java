package day21;

public class AvgDemp {
	public static void main(String[] args) {
		try {
			System.out.println(avg(1,-2,3));
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int avg(int...a)throws MinusException {
		int sum = 0;
		for(int s:a) {
			if (s<0) {
				throw new MinusException();
			}
			sum += s;
			
		}
	return sum/a.length;
	}
}
