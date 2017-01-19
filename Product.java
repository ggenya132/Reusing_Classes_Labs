/**
 * Created by eugenevendensky on 1/18/17.
 */
public class Product {

    int price;
    int id;
    int quantityOnHand;
    int sum;
static int counter;

    public Product(int price, int id, int quantityOnHand){
        this.price = price;
        this.id = id;
        this.quantityOnHand = quantityOnHand;
        counter++

        sum = id * price;

    }
    public static int[];

}
