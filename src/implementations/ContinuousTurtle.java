package implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Position;

public class ContinuousTurtle extends Turtle {

    public ContinuousTurtle(Position p, Paper paper) {
	super(p, paper);
    }

    @Override
    public void move(int steps) {
	while (steps-- > 0) {
	    if (writing && pap.inBounds(pos)) {
		mark();
	    }
	    pos = dir.move(pos);
	}
    }
}