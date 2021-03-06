package gr.aueb.dmst.theSpellCheckProject.Javengers;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * WordTest_existsInDictionary class is used to verify the correctness of
 * existsInDictionary method from Word class.
 *
 * @author Javengers team
 * @see existsInDictionary
 */

public class WordTest_existsInDictionary {

	// setUp method is executed at the start of every test of junit and prints "setting up..."
	@Before
	public void setUp() throws Exception {
		System.out.println("setting up...");
	}

	/**
	 * The method used to make the tests
	 *
	 * Creation of objects "Word", word1 and word2
	 *
	 * assert statements
	 * <p>
	 * assertTrue checks that the boolean condition is true. Object word1 is
	 * initialized with a word that exists in the Dictionary, so the boolean has
	 * to be true. assertFalse checks that the boolean condition is false.
	 * Object word2 is initialized with a word that does not exist in the
	 * Dictionary, so the boolean has to be false.
	 *
	 * @throws SQLException
	 */
	@Test
	public void testExistsInDictionary() throws SQLException {
		try {
			Word word1 = new Word("Ο", " ");
			Word word2 = new Word("καιρώς", ".");
			boolean bW1 = word1.existsInDictionary(word1.getWord());
			boolean bW2 = word2.existsInDictionary(word2.getWord());
			assertTrue(bW1);
			assertFalse(bW2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// tearDown method is executed at the end of every test of junit test and prints "end of test"
	@After
	public void tearDown() throws Exception {
		System.out.println("end of test...");
	}

}
