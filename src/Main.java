import Models.Item;
import Models.Order;


public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1,"Tshirt",200);
        Item item2 = new Item(2, "Pant",500);
        Item item3 = new Item(3, "Sweater", 800);

        Order order1 = new Order(1,item2.getPrice(),item2.getName());
        Order order2 = new Order(2,item3.getPrice(),item3.getName());
        Order order3 = new Order(3,item1.getPrice(),item1.getName());

            System.out.println("Yawat ko luga pasal");
            System.out.println("Boudha,Kathmandu");
            System.out.println("Contact: 9020302012\n");
            System.out.println("SN\tOrder\tPrice");
            System.out.println("1\t"+ order1.getItems() + "\t"+ order1.getPrice() );
            System.out.println("2\t"+ order2.getItems() + "\t"+ order2.getPrice());
            System.out.println("3\t"+ order3.getItems() + "\t"+ order3.getPrice());
            System.out.println("Grand total: " + (order1.getPrice()+order2.getPrice()+order3.getPrice()));

    }


}