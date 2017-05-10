package tgy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DvdTest {

	@Test
	public void testCompareAfterBefore() {
		Dvd aaa = new Dvd();
		aaa.setTitle("aaa");

		Dvd bbb = new Dvd();
		bbb.setTitle("bbb");

		assertEquals("aaa'nin alfabetik olarak bbb'den önde olmasi gerekiyor", -1, aaa.compareTo(bbb));
	}

	@Test
	public void testCompareSame() {
		Dvd aaa = new Dvd();
		aaa.setTitle("aaa");
		assertEquals("aaa alfabetik olarak aaa ile ayni siradadir", 0, aaa.compareTo(aaa));
	}

	@Test
	public void testCompareBeforeAfter() {
		Dvd aaa = new Dvd();
		aaa.setTitle("aaa");
		Dvd bbb = new Dvd();
		bbb.setTitle("bbb");
		assertEquals("bbb'nin alfabetik olarak aaa'dan sonra " + "gelmesi gerekiyor", 1, bbb.compareTo(aaa));
	}
}
