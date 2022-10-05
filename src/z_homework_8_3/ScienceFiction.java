package z_homework_8_3;

public class ScienceFiction extends Book {

	
	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	
	@Override
	int getLateFee(int lateDays) {
		return lateDays*600;
	}
}
