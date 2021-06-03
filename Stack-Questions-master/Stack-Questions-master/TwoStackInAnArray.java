package stack;

public class TwoStackInAnArray {
	
	int size;
	int top1,top2;
	int arr[];
	TwoStackInAnArray(int n){
		size=n;
		top1=-1;
		top2=size;
		arr = new int[n];
	}
	void push1(int x) {
		if(top1<top2-1) {
			top1++;
			arr[top1]=x;
		}
		else {
			System.out.println("Overflow");
		}
	}
	void push2(int x) {
		if(top1<top2-1) {
			top2--;
			arr[top2]=x;
		}
		else {
			System.out.println("Underflow");
		}
	}
	 int pop1() {
		if(top1>=0) {
			int x= arr[top1];
			top1--;
			return x;
		}
		else {
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	 int pop2() {
		if(top2<size) {
			int x= arr[top2];
			top2++;
			return x;
		}
		else {
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackInAnArray st = new TwoStackInAnArray(6);
		st.push1(12);
		st.push2(20);
		st.push2(30);
		st.push1(13);
		st.push1(14);
		st.push2(10);
		System.out.println(st.pop1());
		st.push2(5);
		System.out.println(st.pop2());
	}

}
