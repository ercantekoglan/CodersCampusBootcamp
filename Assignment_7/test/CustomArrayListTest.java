import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	CustomArrayList<Integer> sut = new CustomArrayList<>();

	@Test
	void should_add_item() {
		for (int i = 0; i < 41; i++) {
			sut.add(i);
		}
		assertEquals(34, sut.get(34));
	}

	@Test
	void should_add_item_specified_index() {
		for (int i = 0; i < 41; i++) {
			sut.add(i);
		}
		sut.add(40, 2022);
		assertEquals(2022, sut.get(40));

		sut.add(0, 2021);
		assertEquals(2021, sut.get(0));
	}

	@Test
	void should_throwException_specified_index() {
		for (int i = 0; i < 41; i++) {
			sut.add(i);
		}

		try {
			assertEquals(-1, sut.get(-1));
			assertEquals(50, sut.get(50));
			fail("Should have thrown an IndexOutOfBoundsException");
		} catch (final IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	@Test
	void should_get_size() {
		for (int i = 0; i < 41; i++) {
			sut.add(i);
		}

		assertEquals(41, sut.getSize());
	}

	@Test
	void should_remove_item() {
		for (int i = 0; i < 9; i++) {
			sut.add(i);
		}
		sut.remove(1);
		assertEquals(2, sut.remove(1));
	}

	@Test
	void should_get_item_index() {

		for (int i = 0; i < 20; i++) {
			sut.add(i);
		}

		Integer expectedInteger = sut.get(10);
		assertEquals(10, expectedInteger);
	}

	@Test
	void should_throwException_by_getting_index() {
		for (int i = 0; i < 20; i++) {
			sut.add(i);
		}

		try {
			assertEquals(30, sut.get(30));
			fail("Should have thrown an IndexOutOfBoundsException");
		} catch (final IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

}
