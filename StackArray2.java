ublic class StackArray2 {
	
	// create Array

	char array[] = new char[20];
	
	//  give the position from the array
	
	int pointer =0;
	
	//main method

	public static void main(String[] args) {
		
		// create Object

		StackArray2 myStack = new StackArray2();
		
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('m');
		myStack.pop();
		
//		myStack.push(17);
//		myStack.push(20);
		myStack.print();

	}
	
	// check if myStack is full

	public void push(char o) {
		if (isFull() == true) {
			System.out.println("overflow");
		}

		array[pointer] = o;
		pointer++;
	}

	// check if myStack is empty
	
	public int pop() {
		if (isEmpty() == true) {
			System.out.println("underflow");
		}
		
		pointer--;
		int tmp = array[pointer];
		array[pointer] = 0;
		
		return tmp;
	}
	
	// controls the status (isFull)
	// if pointer longer

	public boolean isFull() {
		boolean flag = false;
		if (pointer == array.length) {
			flag = true;
			return flag;
		}
		return flag;

	}
	
	// controls the status (isEmpty)
	// if pointer 0

	public boolean isEmpty() {
		boolean flag = false;
		if (pointer == 0) {
			flag = true;
			return flag;
		}
		return flag;

	}
	
	// output
	
	public void print(){
		for (int i = 0; i < pointer; i++) {
			   System.out.print(array[i]);
			   System.out.println("");
			   System.out.println("__");
			   
		}
	}

}
