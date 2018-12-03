public class StackArray2 {

	char array[] = new char[4];
	int pointer =0;

	public static void main(String[] args) {

		StackArray2 myStack = new StackArray2();
		
		myStack.push('a');
		myStack.pop();
		myStack.push('b');
//		myStack.push(17);
//		myStack.push(20);
		myStack.print();

	}

	public void push(char o) {
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
	
	public void print(){
		for (int i = 0; i < pointer; i++) {
			   System.out.print(array[i]+" ");
		}
	}

}
