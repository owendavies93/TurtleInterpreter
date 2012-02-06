package testsuite;

import java.io.UnsupportedEncodingException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;

import testsuite.internal.CatchExitRule;

import static testsuite.TestSuiteHelper.*;

public class Part2 {

    private static final int FIVE_SECONDS = 5000;

    @Rule
    public Timeout timeout = new Timeout(FIVE_SECONDS);

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Rule
    public CatchExitRule disableSystemExit = new CatchExitRule();

    @Test
    public void testBouncyTurtles() throws UnsupportedEncodingException {
	assertEquals(readFile("testcases/outputs/turtles_bouncy.res"),
		runMain("testcases/inputs/turtles_bouncy.dat", tmpFolder));
    }

    @Test
    public void testReflectingTurtles() throws UnsupportedEncodingException {
	assertEquals(readFile("testcases/outputs/turtles_reflecting.res"),
		runMain("testcases/inputs/turtles_reflecting.dat", tmpFolder));
    }

    @Test
    public void testContinuousTurtles() throws UnsupportedEncodingException {
	assertEquals(readFile("testcases/outputs/turtles_continuous.res"),
		runMain("testcases/inputs/turtles_continuous.dat", tmpFolder));
    }

    @Test
    public void testWrappingTurtles() throws UnsupportedEncodingException {
	assertEquals(readFile("testcases/outputs/turtles_wrapping.res"),
		runMain("testcases/inputs/turtles_wrapping.dat", tmpFolder));
    }

}
