package gtd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testFrequentation {

	JournalInterface journal; 
	Frequentation freq = new Frequentation();
	
	
	@After
	public void tearDown() throws Exception {
		journal = null;
		freq = null;
	}

	@Test
	public void testEntreesMinimalesLundi() {
		EntreeJournal[] entreesSemaineMinLundi = new EntreeJournal[7];
		journal = new Journal(entreesSemaineMinLundi); 
		
		assertEquals(0, freq.frequentationMin(journal));		
	}
	
	@Test
	public void testEntreesMinimalesDimanche() {
		EntreeJournal[] entreesSemaineMinDimanche = new EntreeJournal[7];
		journal = new Journal(entreesSemaineMinDimanche); 
		
		assertEquals(7, freq.frequentationMin(journal));		
	}
	
	@Test
	public void testEntreesMinimalesLundiEtMardi() {
		EntreeJournal[] entreesSemaineMinLundiEtMardi = new EntreeJournal[7];
		journal = new Journal(entreesSemaineMinLundiEtMardi); 
		
		assertEquals(0, freq.frequentationMin(journal));		
	}
	
	@Test
	public void testEntreesMinSupA10000000() {
		EntreeJournal[] entreesMinSupA10000000 = new EntreeJournal[7];
		journal = new Journal(entreesMinSupA10000000); 
		
		assertEquals(-1, freq.frequentationMin(journal));		
	}
	
	@Test(expected = Exception.class)
	public void testJournalEntreesVide() {
		EntreeJournal[] entreesVide = null;
		journal = new Journal(entreesVide); 
		
		assertEquals(0, freq.frequentationMin(journal));		
	}


}
