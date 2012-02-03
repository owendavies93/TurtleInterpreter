package turtle;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import turtle.util.Position;

public class TurtleInterpreter {

    private Scanner s;
    private PrintStream pS;
    private Paper p = new Paper(10, 10);
    private final Map<String, Turtle> turtles = new HashMap<String, Turtle>();

    public TurtleInterpreter(Scanner s, PrintStream pS) {
	this.s = s;
	this.pS = pS;
    }

    public void processCommands() {

	while (s.hasNext()) {
	    String next = s.next();
	    if (next.equals("paper")) {
		int width = s.nextInt();
		int height = s.nextInt();
		paper(width, height);
	    } else if (next.equals("new")) {
		String type = s.next();
		String name = s.next();
		int x = s.nextInt();
		int y = s.nextInt();
		newT(type, name, x, y);
	    } else if (next.equals("pen")) {
		String name = s.next();
		String state = s.next();
		pen(name, state);
	    } else if (next.equals("move")) {
		String name = s.next();
		int steps = s.nextInt();
		move(name, steps);
	    } else if (next.equals("right")) {
		String name = s.next();
		int angle = s.nextInt();
		rotate(name, angle);
	    } else if (next.equals("left")) {
		String name = s.next();
		int angle = s.nextInt();
		rotate(name, angle * -1);
	    } else if (next.equals("show")) {
		show();
	    }
	}

    }

    private void paper(int width, int height) {
	p = new Paper(width, height);
    }

    private void newT(String type, String name, int x, int y) {
	Position pos = new Position(x, y);
	turtles.put(name, new Turtle(pos, p));
    }

    private void pen(String name, String state) {
	if (state.equals("up") || state.equals("down")) {
	    turtles.get(name).changePen(state);
	} else {
	    turtles.get(name).changeBrush(state.charAt(0));
	}
    }

    private void move(String name, int steps) {
	turtles.get(name).move(steps);
    }

    private void rotate(String name, int angle) {
	turtles.get(name).rotate(angle);
    }

    private void show() {
	pS.println(p.convert());
    }

}
