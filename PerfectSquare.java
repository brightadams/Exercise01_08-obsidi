public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) {
        // A negative number can never be a perfect square so we return false
		if (num < 0){
			return false;
		}
		// 0 and 1 are perfect squares so we do not need to go through the algorithm.
		if (num == 0 || num == 1){
			return true;
		}
		// The square root of any number > 2 is at most num/2 so we do not have to loop more than half of that number
		for(int i = 1; i <= num/2; i++) {
        	if(i*i == num)
        		return true;
        	else if (i*i > num) return false;
        }
		// if we finish the loop then it means it is not a perfect square so we return falase
		return false;
    }

}
