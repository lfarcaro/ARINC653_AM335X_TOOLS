package arinc653.test;

import java.util.Iterator;

import arinc653.configuration.tools.TargetPlatform;

/**
 * Test pulling class.
 * 
 * @author Lu�s Fernando Arcaro
 */
public class TestsPull {

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Arguments.
	 */
	public static void main(String[] args) {
		try {

			// Target platform
			TargetPlatform tpTargetPlatform = TargetPlatform.AM335X;

			// Iterates tests
			Iterator<String> itTest = Tests.getTests().iterator();
			while (itTest.hasNext()) {

				// Gets next test
				String stTest = itTest.next();

				// Shows test
				System.out.println("Test: " + stTest);

				// Pulls test
				Tests.cmdPullTest(stTest, tpTargetPlatform, null);
			}
		} catch (Throwable t) {

			// Prints error
			t.printStackTrace();
		}
	}
}