package implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Direction;
import turtle.util.Position;

public class ReflectingTurtle extends Turtle {

    public ReflectingTurtle(Position p, Paper paper) {
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

		if (dir == Direction.NE || dir == Direction.SE
			|| dir == Direction.SW || dir == Direction.NW) {
		    dir = dir.rotate(45);
		    if (pap.inBounds(dir.move(pos))) {
			pos = dir.move(pos);
			dir = dir.rotate(45);
		    } else {
			dir = dir.rotate(-90);
			pos = dir.move(pos);
			dir = dir.rotate(-45);
		    }
		} else {
		    dir = dir.rotate(180);
		}

	    }
	}
    }

}
