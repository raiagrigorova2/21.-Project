package Project_21;

public class ChildrenBook extends Book {
	/*
	 * Допълнително поле int age Конструктор public ChildrenBook(double
	 * regularPrice, String publisher, int yearPublished, int age) 70% намаление,
	 * когато е на разпродажба
	 */
	int age;
	
	public ChildrenBook(double
			 regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice, publisher, yearPublished);
		this.age = age;
	}
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }

}
