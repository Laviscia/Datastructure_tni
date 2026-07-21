
public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList todolist =new DoublyLinkedList(); //create a empty list
		
		todolist.insert("Finish Homework");
		todolist.insert("Laundry");
		todolist.insert("Group Meeting");
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.insert(0,"Submit Report");
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.insert(2,"Buy Food");
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.insert("Go to Gym");
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.remove();
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.remove(3);
		System.out.println("To-Do List = " + todolist.traversal());
		
		todolist.remove(0);
		System.out.println("To-Do List = " + todolist.traversal());
	
		System.out.println("To-Do List = " + todolist.backwardTraversal());
		
	}

}
