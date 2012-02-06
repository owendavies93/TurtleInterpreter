package implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Position;

public class NormalTurtle extends Turtle {

    public NormalTurtle(Position p, Paper paper) {
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
	    }
	}
    }

}
