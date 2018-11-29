package rohit;

public class Player {
	private String name;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Player(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	public String toString() {
		return name+" name::"+height+" height";
	}
}
