package turtle.util;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public void setX(int val) {
	x = val;
    }

    public void setY(int val) {
	y = val;
    }

    public String toString() {
	return ("(" + getX() + ", " + getY() + ")");
    }

}