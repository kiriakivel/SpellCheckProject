package gr.aueb.dmst.theSpellCheckProject.Javengers;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * WordTest_findSuggestions class is used to verify the return of suggestions of
 * findSuggestions method from Word class.
 *
 * @throws SQLException
 * @throws Exception
 *
 * @author Javengers team
 * @see findSuggestions
 */

public class WordTest_findSuggestions {

	// setUp method is executed at the start of every test of junit and prints "setting up..."

	@Before
	public void setUp() throws Exception {
		System.out.println("settinng up...");
	}

	/**
	 * The method used to make the tests
	 *
	 * Creation of object "Word", word1
	 *
	 * findSuggestions assignation from the object "word1" located at the Word class
	 * Creation of the string array "str" with length 3 Initialisation of the
	 * array "str" through the object "word1" from the method
	 * getBestPossibleSolutions Creation of the string array "CorrectSolutions"
	 *
	 * assertTrue checks that the boolean condition is true in a for loop it is
	 * tested whether the elements of "str" are the same with "CorrectSolutions"
	 *
	 * @throws SQLException
	 */

	@Test
	public void testFindSuggestions() throws SQLException {
		Word word1 = new Word("παιράσαμε", " ");
		String[] str = new String[3];
		word1.findSuggestions();
		str = word1.getBestPossibleSolutions();
		String[] CorrectSolutions = new String[] { "μοιράσαμε", "κοιτάξαμε", "περάσαμε" }; // random
																							// solutions
		for (int i = 0; i < 3; i++) {
			assertTrue(str[i].equals(CorrectSolutions[i]));
		}
	}

	// tearDown method is executed at the end of every test of junit test and prints "end of test"

	@After
	public void tearDown() throws Exception {
		System.out.println("end of test");
	}
}
