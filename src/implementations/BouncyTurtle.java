package implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Position;

public class BouncyTurtle extends Turtle {

    public BouncyTurtle(Position p, Paper paper) {
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
		dir = dir.rotate(180);
	    }
	}
    }

}
