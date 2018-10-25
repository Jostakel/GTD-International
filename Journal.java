package gtd;

import java.util.ArrayList;

public class Journal implements JournalInterface{

	private ArrayList<EntreeJournal> entrees = new ArrayList<>();
	
	public Journal(EntreeJournal[] entrees) {
		for (int i=0; i<7; i++) {
			this.entrees.add(entrees[i]);
		}
	}

	@Override
	public boolean hasCountNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EntreeJournal getNextCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWeekDayFromDate(String date) {
		// TODO Auto-generated method stub
		return 0;
	}
}
