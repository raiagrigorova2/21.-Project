package Project_21;

public class Main {
    
    public static void main(String[] args) {
		/*
		 * Разгледайте качения проект. Открийте къде и как се използват абстрактни
		 * класове и полиморфизъм.
		 */
    	// Abstract са класовете Product и Electronics, като Electronics е наследник на Product
    	// Product има метод public abstract double computeSalePrice(), който е имплементилан 
    	//в наследниците на Product и Electronics. Създава се масив Product[], 
    	//за който по-късно се създават инстанции. (не може да се създаде инстанция на абстрактен клас)
    	
    	//Пример за полиморфизъм е масивът Product[], от който се създават инстанции на 
    	//субкласовете на Product, и override-ването на double computeSalePrice() от всеки клас без абстрактните. 

        // Declare and create Product array of size 5
        Product[] pa = new Product[7];
        
        // Create object instances and assign them to
        // the type of Product.
        pa[0] = new TV(1000, "Samsung", 30);
        pa[1] = new TV(2000, "Sony", 50);
        pa[2] = new MP3Player(250, "Apple", "blue");
        pa[3] = new Book(34, "Sun press", 1992);
        pa[4] = new Book(15, "Korea press", 1986);
        
        pa[5] = new ChildrenBook(15, "PW press", 1987, 8);
        pa[6] = new ComicBook(14, "PW press", 1924, "Batman");

        
        // Compute total regular price and total
        // sale price.
        double totalRegularPrice = 0;
        double totalSalePrice = 0;
        
        for (int i=0; i<pa.length; i++){
            
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice += pa[i].getRegularPrice();
            
            // Since the sale price is computed differently
            // depending on the product type, overriding (implementation)
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic
            // behavior.
            totalSalePrice += pa[i].computeSalePrice();
            
            System.out.println("Item number " + i +
                    ": Type = " + pa[i].getClass().getName() +
                    ", Regular price = " + pa[i].getRegularPrice() +
                    ", Sale price = " + (Math.round(pa[i].computeSalePrice() * 100.0) / 100.0));
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
    }
    
}
