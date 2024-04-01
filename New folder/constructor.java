package arrays;

class constructor {

private String message;
public constructor(String message) {
	this.message=message;
}
public void printMessage() {
	System.out.println(message);
}

public void printLength() {
	System.out.println(message.length());
}
public static class mainclass{
	public static void main(String args[]) {
	constructor cn=new constructor("hello java");
	cn.printMessage();
	cn.printLength();
	
	}
}
}
