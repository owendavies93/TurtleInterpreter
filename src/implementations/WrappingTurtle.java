package implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Position;

public class WrappingTurtle extends Turtle {

    public WrappingTurtle(Position p, Paper paper) {
	super(p, paper);
    }

    @Override
    public void move(int steps) {
	while (steps-- > 0) {
	    if (writing) {
		mark();
	    }
	    if (pap.inBounds(dir.move(pos))) {
		pos = dir.move(pos);
	    } else {
		int x = dir.move(pos).getX(), y = dir.move(pos).getY();
		int w = pap.getWidth(), h = pap.getHeight();
		if (x < 0 && y >= 0 && y < h) {
		    pos.setX(x + (w + 1));
		} else if (x >= w && y >= 0 && y < h) {
		    pos.setX((x - 1) - w);
		} else if (y < 0 && x >= 0 && x < w) {
		    pos.setY(y + (h + 1));
		} else if (y >= h && x >= 0 && x < w) {
		    pos.setY((y - 1) - h);
		} else if (x < 0 && y < 0) {
		    pos.setX(x + (w + 1));
		    pos.setY(y + (h + 1));
		} else if (x < 0 && y >= h) {
		    pos.setX(x + (w + 1));
		    pos.setY((y - 1) - h);
		} else if (x >= w && y < 0) {
		    pos.setX((x - 1) - w);
		    pos.setY(y + (h + 1));
		} else if (x >= w && y >= h) {
		    pos.setX((x - 1) - w);
		    pos.setY((y - 1) - h);
		}
		pos = dir.move(pos);
	    }
	}
    }
}
