
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumArrayController nums = new NumArrayController();
		nums.display("Display an initial dataset: ");
		
		int[] copy_nums = new int[nums.getSize()-1];
		
		for(int i=0; i<copy_nums.length; i++) {
			copy_nums[i] = nums.getNumArray()[i];
		}
		
		nums.setNumbers(copy_nums);
		nums.display("\n\nAfter deleted the first element: ");
	}

}
