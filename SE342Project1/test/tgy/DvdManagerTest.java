package tgy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DvdManagerTest {

	private DvdManager manager;
	private Dvd gora, arog;

	@Before
	public void setUp() {
		manager = new DvdManager();
		gora = new Dvd();
		arog = new Dvd();

	}

	/**
	 * Test 1: Boş bir listenin büyüklüğü (size) 0 olmalı.
	 */
	@Test
	public void testZeroSizeList() {
		assertEquals("Listenin büyüklüğü 0 değil", 0, manager.size());
	}

	/**
	 * Test 2: Listeye bir film eklendiğinde listenin büyüklüğü 1 olmalı.
	 */
	@Test
	public void testListSizeAfterAddingOneItem() {
		manager.add(gora);
		assertEquals("Listenin büyüklüğü 1 değil", 1, manager.size());
	}

	/**
	 * Test 3: Listeye iki film eklendiğinde listenin büyüklüğü 2 olmalı.
	 */
	@Test
	public void testListSizeAfterAddingTwo() {
		manager.add(gora);
		manager.add(arog);

		assertEquals("Listenin büyüklüğü 2 değil", 2, manager.size());
	}

	/**
	 * Test 4: BBB ve AAA ismini taşıyan iki film listeye eklendiğinde AAA
	 * ismini taşıyan film listede BBB isimli filmden önce yer almalıdır.
	 * 
	 * Alfabetik sıralama
	 */
	@Test
	public void testSortedDvdListReturnsNothing() {
		List<Dvd> list = manager.getSortedList();
		assertEquals("liste bos degil", 0, list.size());
	}

	@Test
	public void testSingleDvdReturnedAsSortedList() {
		manager.add(gora);
		gora.setTitle("Gora");
		List<Dvd> list = manager.getSortedList();
		assertEquals("listedeki ilk film Gora degildir", "Gora", list.get(0).getTitle());
	}

	@Test
	public void testMultipleDvdReturnedAsSortedList() {
		manager.add(gora);
		gora.setTitle("Gora");
		
		manager.add(arog);
		arog.setTitle("Arog");
		
		List<Dvd> list = manager.getSortedList();
		assertEquals("listedeki ilk film Arog degildir", "Arog", list.get(0).getTitle());
		
		assertEquals("listedeki ikinci film Gora degildir", "Gora", list.get(1).getTitle());
	}

}
