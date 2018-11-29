package rohit;

public class CarList {
private String name;
private String engC;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEngC() {
	return engC;
}
public void setEngC(String engC) {
	this.engC = engC;
}
public CarList(String name,String engC) {
	this.name=name;
	this.engC=engC;
}
public String toString() {
	return this.name+"="+this.engC;
}

}
