public class StackArray2 {

	// create Array

	char array[] = new char[20];

	// give the position from the array

	int pointer = 0;

	// main method

	public static void main(String[] args) {

		// create Object

		StackArray2 myStack = new StackArray2();

		// push and pop from myStack

		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('m');
		myStack.pop();
		myStack.push('t');
		myStack.pop();

//		myStack.push(17);
//		myStack.push(20);

		// output from myStack

		myStack.print();

	}

	// myStack.push

	public void push(char o) {

		// if myStack is full output overflow

		if (isFull() == true) {
			System.out.println("overflow");
		}

		array[pointer] = o;

		// sit on
		pointer++;
	}

	// MyStack pop
	public int pop() {

		// if myStack is empty output underflow

		if (isEmpty() == true) {
			System.out.println("underflow");
		}

		// take away
		pointer--;

		// new Integer
		int zero = array[pointer];

		// if pointer 0 myStack is empty
		array[pointer] = 0;

		return zero;
	}

	// controls the status (isFull)
	// Checker for if the array is filled

	public boolean isFull() {

		// if flag true then the output is eight times "overflow" before the stack
		// starts
		// query whether true or false
		boolean flag = false;

		// if myStack is full so output "overflow"
		if (pointer == array.length) {
			flag = true;
			return flag;
		}
		return flag;

	}

	// controls the status (isEmpty)
	// if pointer 0
	public boolean isEmpty() {

		// if flag true then the output is two times "underflow" before the stack starts
		// query whether true or false
		boolean flag = false;

		// if myStack is empty so output "underflow"
		if (pointer == 0) {
			flag = true;
			return flag;
		}
		return flag;

	}

	// output function

	public void print() {
		for (int i = 0; i < pointer; i++) {
			System.out.print(array[i]);
			System.out.println("");
			System.out.println("__");

		}
	}

}
