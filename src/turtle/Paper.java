package turtle;

import turtle.util.Position;

public class Paper {

    private int w;
    private int h;
    private char[][] sheet;

    public Paper(int width, int height) {
	this.w = width;
	this.h = height;
	this.sheet = new char[w][h];
    }

    public int getWidth() {
	return w;
    }

    public int getHeight() {
	return h;
    }

    public void setWidth(int n) {
	w = n;
    }

    public void setHeight(int n) {
	h = n;
    }

    public boolean inBounds(Position p) {
	return (p.getX() <= w) && (p.getY() <= h);
    }

    public void mark(char c, Position p) {
	sheet[(sheet.length - 1) - p.getX()][p.getY()] = c;
    }

    public String convert() {
	String res = "";
	for (char[] line : sheet) {
	    for (char c : line) {
		res += c;
	    }
	    res += "\n";
	}
	return res;
    }

}
