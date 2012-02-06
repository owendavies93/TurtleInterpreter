package turtle;

import turtle.util.Position;

public class Paper {

    private int w;
    private int h;
    private char[][] sheet;

    public Paper(int width, int height) {
	this.w = width;
	this.h = height;
	this.sheet = new char[h][w];

	char defaultChar = ' ';
	for (int i = 0; i < h; i++) {
	    for (int j = 0; j < w; j++) {
		sheet[i][j] = defaultChar;
	    }
	}
    }

    public int getWidth() {
	return w;
    }

    public int getHeight() {
	return h;
    }

    public boolean inBounds(Position p) {
	return (p.getX() < w) && (p.getY() < h);
    }

    public void mark(char c, Position p) {
	sheet[(sheet.length - 1) - p.getY()][p.getX()] = c;
    }

    public String convert() {
	String res = "";
	for (char[] line : sheet) {
	    for (char c : line) {
		res += c;
	    }
	    res += "\r\n";
	}
	return res;
    }

}
