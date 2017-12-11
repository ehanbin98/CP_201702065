public class Box {
	public int width;
	public int length;
	public int height;
	public int volume;

	public void setWidth(int w) {
		width = w;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int l) {
		length = l;
	}

	public int getLength() {
		return length;
	}

	public void setHeight(int h) {
		height = h;
	}

	public int getHeight() {
		return height;
	}

	public void setVolume(int v) {
		volume = width * length * height;
	}

	public void print() {
		System.out.println("상자의 가로 : " + width);
		System.out.println("상자의 세로 : " + length);
		System.out.println("상자의 높이 : " + height);
		System.out.println("상자의 부피 : " + volume);
	}

}
