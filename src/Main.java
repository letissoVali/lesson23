import ru.valiullin.ImplBasket;

public class Main {

    //Todo Реализовать класс корзины интернет магазина по следующему интерфейсу:
    //interface Basket {
    //    void addProduct(String product, int quantity);
    //    void removeProduct(String product);
    //    void updateProductQuantity(String product, int quantity);
    //    void clear();
    //    List<String> getProducts();
    //    int getProductQuantity(String product);
    //}

    public static void main(String[] args) {
        ImplBasket implBasket = new ImplBasket();
        System.out.println("Add products in order");
        implBasket.addProduct("Coffee",3);
        implBasket.addProduct("Tea",1);
        implBasket.addProduct("Cookies",2);
        implBasket.addProduct("Buns",5);
        System.out.println("Print order list");
        implBasket.getProducts();
        System.out.println("Edit products in order list");
        implBasket.updateProductQuantity("Coffee",2);
        implBasket.updateProductQuantity("Buns",6);
        implBasket.updateProductQuantity("Bunnies",2);
        implBasket.updateProductQuantity("Koffee",2);
        implBasket.removeProduct("Tea");
        System.out.println("Print edited order list");
        implBasket.getProducts();
        System.out.println("Получение количества товаров по названию");
        System.out.println(implBasket.getProductQuantity("Coffee"));
        System.out.println(implBasket.getProductQuantity("Buns"));
        //implBasket.getProductQuantity("Tea"); //Проблема с товарами не в списке

        System.out.println("Clean order list");
        implBasket.clear();
        System.out.println("Print cleaned order list");
        implBasket.getProducts();

    }
}
