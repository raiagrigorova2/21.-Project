package Project_21;

public class ComicBook extends Book {
	/*
	 * Допълнително поле String characterName Конструктор public ComicBook(double
	 * regularPrice, String publisher, int yearPublished, String characterName) 60%
	 * намаление, когато е на разпродажба
	 */
	String characterName;
	
	public ComicBook(double
			 regularPrice, String publisher, int yearPublished, String characterName) {
		super(regularPrice, publisher, yearPublished);
		this.characterName = characterName;
	}
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.4;
    }

}
