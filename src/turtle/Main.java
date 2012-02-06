package turtle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException,
	    UnsupportedEncodingException {

	Scanner s;
	PrintStream pS;

	if (args.length == 0) {
	    s = new Scanner(System.in, "UTF-8");
	    pS = new PrintStream(System.out, true, "UTF-8");
	} else if (args.length == 1) {
	    File f = new File(args[0]);
	    s = new Scanner(f, "UTF-8");
	    pS = new PrintStream(System.out, true, "UTF-8");
	} else {
	    File f = new File(args[0]);
	    s = new Scanner(f, "UTF-8");
	    pS = new PrintStream(args[1], "UTF-8");
	}

	TurtleInterpreter tI = new TurtleInterpreter(s, pS);
	tI.processCommands();

    }

}
