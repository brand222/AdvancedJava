package Collections;

import java.util.Stack;

//A stack uses a last in, first out order (LIFO)

//it is a vertical stack of objects

//when you pull an element off a stack, the last element is the first one to come out
//items are added on one end and deleted on the same end
//Think of it like a 'stack of plates'
//to add, you push()
//to remove, you pop()
//peek() method makes a copy of the first item
//a stack is an easy way to reverse a collection of values
public class StacksPractice {

	public static void main(String[] args) {
		Stack stack = new Stack();

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		while (!stack.empty()) {
			// here it prints the next top element we are 'popping' off
			// (deleting) from the stack
			System.out.print(stack.pop());
			System.out.print(",");
		}
		System.out.println("LIFT-OFF!");
	}
}
