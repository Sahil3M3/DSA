
public class StackMain {
	
	public static void main(String[] args) {
		Stack s=new Stack(5);
		int d;
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		d=s.peak();
		System.out.println(d);

	}

}
