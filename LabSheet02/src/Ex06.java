
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumArrayController nums = new NumArrayController();
		nums.display("Display an initial dataset: ");
		
		int[] copy_nums = new int[nums.getSize()-1];
		
		for(int i=0; i<2; i++) {
			copy_nums[i] = nums.getNumArray()[i];
		}
		
		// copy nums index 3-6 to copy_num index 2-5
		for(int i=2+1; i<nums.getSize(); i++) {
			copy_nums [i-1] = nums.getNumArray()[i];
		}
		
		nums.setNumbers(copy_nums);
		nums.display("\n\nAfter deleted data in index 2: ");
		
	}

}
