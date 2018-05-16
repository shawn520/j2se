package character;

public class MyStringBuffer implements IStringBuffer {
	
	int capacity = 16;
	int length = 0;
	char [] value;

	public String toString(){
		char [] realValue = new char[length];
		System.arraycopy(value, 0, realValue, 0, length);
		return new String(realValue);
	}
	
	public MyStringBuffer() {
		// TODO Auto-generated constructor stub
		value = new char[capacity];
	}
	
	MyStringBuffer(String str){
		if(null!=str)
			value = str.toCharArray();
		length = value.length;
		if(capacity<value.length)
			capacity = value.length * 2;
	}

	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void append(char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for(int i = 0; i < length / 2; i++){
			char temp = value[i];
			value[i] = value[length - i - 1];
			value[length - i - 1] = temp;
		}
		
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
