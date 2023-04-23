import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorseCodeTreeTest {

	private MorseCodeTree mct;
	private String root;

	@BeforeEach
	void setUp() throws Exception {
		mct= new MorseCodeTree();

	}

	@AfterEach
	void tearDown() throws Exception {
		mct=null;
	}



	@Test
	void testGetRoot() {
		root=mct.getRoot().getData();
		assertEquals("", root);

	}

	@Test
	void testSetRoot() {
		String newRoot;

		TreeNode<String> name= new TreeNode<String>("robel");

		mct.setRoot(name);

		assertEquals("robel",mct.getRoot().getData());

	}

	@Test
	void testInsert() {
		mct.insert("-.-", "b");
		assertEquals("b",mct.fetch("-.-"));
	}



	@Test
	void testFetch() {
		String letterFetched;


		letterFetched = mct.fetch("-.");

		assertEquals("n", letterFetched);

		String letterFetched2;


		letterFetched2 = mct.fetch("--.-");

		assertEquals("q", letterFetched2);
	}


	@Test
	void testToArrayList() {

		ArrayList<String> list = new ArrayList<String>();

		list = mct.toArrayList();

		assertEquals("h", list.get(0));
		assertEquals("s", list.get(1));
		assertEquals("v", list.get(2));
		assertEquals("i", list.get(3));
		assertEquals("f", list.get(4));
		assertEquals("u", list.get(5));
		assertEquals("e", list.get(6));
		assertEquals("l", list.get(7));
		assertEquals("r", list.get(8));
		assertEquals("a", list.get(9));
		assertEquals("p", list.get(10));
		assertEquals("w", list.get(11));
		assertEquals("j", list.get(12));
		assertEquals("", list.get(13));
		assertEquals("b", list.get(14));
		assertEquals("d", list.get(15));
		assertEquals("x", list.get(16));
		assertEquals("n", list.get(17));
		assertEquals("c", list.get(18));
		assertEquals("k", list.get(19));
		assertEquals("y", list.get(20));
		assertEquals("t", list.get(21));
		assertEquals("z", list.get(22));
		assertEquals("g", list.get(23));
		assertEquals("q", list.get(24));
		assertEquals("m", list.get(25));
		assertEquals("o", list.get(26));
	}


}
