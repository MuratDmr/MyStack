public class StackArray1 {

	int array[] = new int[100];
	int pointer = 1;

	public static void main(String[] args) {

		StackArray1 myStack = new StackArray1();

		myStack.push(10);
		myStack.pop();
		myStack.push(10);
		myStack.push(15);
		myStack.push(40);
		myStack.push(70);
		myStack.push(5);
		myStack.push(22);
		myStack.pop();
		myStack.push(99);
		myStack.push(101);
//		myStack.push(17);
//		myStack.push(20);
		
		myStack.print();

	}

	public void push(int o) {
		if (isFull() == true) {
			System.out.println("overflow");
		}

		array[pointer] = o;
		pointer++;
	}

	public int pop() {
		if (isEmpty() == true) {
			System.out.println("underflow");
		}

		pointer--;
		int tmp = array[pointer];
		array[pointer] = 0;

		return tmp;
	}

	public boolean isFull() {
		boolean flag = false;
		if (pointer == array.length) {
			flag = true;
			return flag;
		}
		return flag;

	}

	public boolean isEmpty() {
		boolean flag = false;
		if (pointer == 0) {
			flag = true;
			return flag;
		}
		return flag;

	}

	public void print() {
		for (int i = 0; i < pointer; i++) {
			System.out.print(array[i] + " ,");
		}
	}

}