package model;
import exceptions.IDNoMatchException;
import model.Minimarket;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MinimarketTest {

	private Minimarket myMinimarket;
	
	private void setupScenary1() {
		myMinimarket = new Minimarket();
	}
	
	@Test
	public void testAddPerson1() {
		setupScenary1();
		String ty= "CC";
		int ide = 1233;
		try {
			myMinimarket.addPerson(ty,ide);
		} catch (IDNoMatchException e) {
			e.printStackTrace();
		}
		assertEquals(1,myMinimarket.getPeople().size());
	}
	
	@Test
	public void testAddPerson2() {
		setupScenary1();
		String ty= "TI";
		int ide = 1235;
		try {
			myMinimarket.addPerson(ty,ide);
		} catch (IDNoMatchException e) {
			e.printStackTrace();
		}
		assertEquals(0,myMinimarket.getPeople().size());
	}
	
	@Test
	public void testAddPerson3() {
		setupScenary1();
		String ty= "CC";
		int ide = 1234;
		try {
			myMinimarket.addPerson(ty,ide);
		} catch (IDNoMatchException e) {
			e.printStackTrace();
		}
		assertEquals(0,myMinimarket.getPeople().size());
	}

}
