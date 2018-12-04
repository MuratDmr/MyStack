public class StackArray1  {
	// create Array
	int size = 20; 
	char array[] = new char[size];
	//  give the position from the array
	int pointer =0;
	//main method
	public static void main(String[] args) {
	
		// create Object
		StackArray1 myStack = new StackArray1();
		// push and pop of char's
		myStack.push('a');
		myStack.push('b');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('f');
		myStack.push('m');
		myStack.pop();
//		myStack.push('x');
//		myStack.push('y');
//		myStack.push('z');
		myStack.print();
		
	}	
		
	//define the push function
	//
	public void push(char X) {
		if (pointer >= this.size) {
			resize(pointer+20);
		}
		array[pointer] = X;
		pointer++;
		
	}	
	//define the pop function
	public int pop() {
		pointer--;
		//transfer the point to pop to var tmp
		int tmp = array[pointer];
		//the point have to be 0 after the pop out
		array[pointer] = 0;
		//gives the number back which we want to pop
		return tmp;	
	}	
	//prints the elements of the stack out
	public void print(){
		for (int i = 0; i < pointer; i++) {
			   System.out.print(array[i]);
			   System.out.println();
		}
	}
	
	void resize(int newSize) {
		char array2[] = new char [newSize];
		for (int t=0; t< size; t++) {
			array2[t] = array[t] ; 
		}
		
		array = array2 ;
		size = newSize; 
	}
	
	
}
