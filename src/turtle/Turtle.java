package turtle;

import turtle.util.*;

public abstract class Turtle {

    protected Position pos;
    protected Direction dir;
    protected boolean writing;
    private char brush;
    protected Paper pap;

    public Turtle(Position p, Paper paper) {
	this.pos = new Position(p.getX(), p.getY());
	this.dir = Direction.N;
	this.writing = false;
	this.pap = paper;
	this.brush = '*';
    }

    public void changePen(String state) {
	if (state.equals("up")) {
	    writing = false;
	} else {
	    writing = true;
	}
    }

    public void changeBrush(char val) {
	brush = val;
    }

    public void rotate(int angle) {
	dir = dir.rotate(angle);
    }

    public void mark() {
	pap.mark(brush, pos);
    }

    public abstract void move(int steps);
}
