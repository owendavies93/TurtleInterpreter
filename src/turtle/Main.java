package turtle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	Scanner s;
	PrintStream pS;

	if (args.length == 0) {
	    s = new Scanner(System.in);
	    pS = new PrintStream(System.out);
	} else if (args.length == 1) {
	    File f = new File(args[0]);
	    s = new Scanner(f, "UTF-8");
	    pS = new PrintStream(System.out);
	} else {
	    File f = new File(args[0]);
	    s = new Scanner(f, "UTF-8");
	    pS = new PrintStream(args[1]);
	}

	TurtleInterpreter tI = new TurtleInterpreter(s, pS);
	tI.processCommands();

    }

}
