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
		System.out.println("������ ���� : " + width);
		System.out.println("������ ���� : " + length);
		System.out.println("������ ���� : " + height);
		System.out.println("������ ���� : " + volume);
	}

}
