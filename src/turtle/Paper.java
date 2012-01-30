package turtle;

import turtle.util.Position;

public class Paper {

    private int w;
    private int h;

    public Paper(int width, int height) {
	this.w = width;
	this.h = height;
    }

    public int getWidth() {
	return w;
    }

    public int getHeight() {
	return h;
    }

    public boolean inBounds(Position p) {
	return (p.getX() <= w) && (p.getY() <= h);
    }

    public void mark(char c) {

    }

    public String convert() {
	return null;
    }

}
