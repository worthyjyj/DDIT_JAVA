package z_homework_8_3;

public class Poet extends Book{
	@Override
	int getLateFee(int lateDays) {
		return lateDays*200;
	}
	
	public Poet(String title, String author) {
		super(title, author);
	}
}
