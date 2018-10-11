package ru.valiullin;

import java.util.ArrayList;
import java.util.List;

public class ImplBasket implements Basket{
    List<String> list = new ArrayList<String>();
    List<Integer> quant = new ArrayList<Integer>();

    @Override // Основой будем считать то что название и колечество вводятся с одним индексом в разные массивы листов
    public void addProduct(String product, int quantity) {
        list.add(product);
        quant.add(quantity);
    }

    @Override //удаление элементов
    public void removeProduct(String product) {
        Integer index = getIndex(product);
        list.remove(product);
        quant.remove(index);
    }

    @Override //Обновление колличиства товаров
    public void updateProductQuantity(String product, int quantity) {
        Integer index = getIndex(product);
        //System.out.println(index);
        if(index != -1) {
            quant.set( index, quantity);
        } else {
            System.out.println("Does not supported product type");
        }
    }

    @Override //Удаление из массивов всех элементов
    public void clear() {
        list.removeAll(list);
        quant.removeAll(quant);
    }

    @Override //Получение все продуктов из массива
    public List<String> getProducts() { //Не понял как возвращать значение из массива в return
        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Товар: " + list.get(i) + " в колличестве " + quant.get(i) + " шт.");
            }
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        Integer index = getIndex(product);
        //System.out.println(quant.get(index));
        int result = quant.get(index);
        return result;
    }

    /**
     * Util method getIndex
     *
     */

    private Integer getIndex(String product) {
        Integer index = 0;
        if (list.contains(product)) {                           //Получаем индекс товара из листа
            for (int i = 0; i < list.size(); i++) {
                if (product.equalsIgnoreCase(list.get(i))) {
                    index = i;
                    break;
                }
            }
        } else {
            index = -1;
        }
        return index;
    }
}
