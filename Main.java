
public class Main {

	public static void main(String[] args) {
		Product product1= new Product();
		product1.name="Laptop";
		product1.description="asus Laptop";
		product1.price=5000;
		product1.stockAcount=3;
		
ProductManager productManager= new ProductManager();
productManager.Add(product1);

	}

}
