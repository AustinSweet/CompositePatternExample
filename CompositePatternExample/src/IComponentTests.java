import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class IComponentTests {
	
	@Test
	public void badAddInputTest() {
		Integer test = 9;
		Playlist testList = new Playlist("ThisIsATest");
		assertEquals(false, testList.add(test));
	}
	
	@Test
	public void goodInputTest() {
		Song testSong = new Song("T", "t");
		Playlist testList = new Playlist("ThisIsATest");
		assertEquals(true, testList.add(testSong));
	}
}
