package matrix;

public class MyDimension {
	private int width;
	private int height;
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public MyDimension(int x, int y) {
		this.width=y;
		this.height=x;
	}

}