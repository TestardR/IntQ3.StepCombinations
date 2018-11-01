public class App {

	public static void main(String[] args) {
		System.out.println(calculateStepWays(3));
	}



	// time complexity = exponential --> 2^n

	public statis int calculateStepWays(int n){
		if( n <= 2){
			return n;
		} else {
			return calculateStepWays(n-1) + calculateStepWays(n-2);
		}
	}

	// time complexity is O(n)

	public static int calculateStepWaysNonRecursive(int n){
		if( n <= 2){
			return n;
		} else {
		int first = 1;
		int second = 2;
		int nth = 2;

		for(int i = 3; i <= n; i ++){
			nth = first + second;
			first = second;
			second = nth;
		}

		return nth;
	}
}