package gtd;

public interface JournalInterface {
	
	public abstract boolean hasCountNext();
	
	public abstract EntreeJournal getNextCount();
	
	public abstract int getWeekDayFromDate(String date);
	
}
