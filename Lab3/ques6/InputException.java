package Lab3.ques6;

public class InputException extends RuntimeException{
private int n;

private String msg;

public InputException(int n) {
	this.n=n;
}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}


}
