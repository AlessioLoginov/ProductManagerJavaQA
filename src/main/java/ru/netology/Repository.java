package ru.netology;

public class Repository { //репозиторий

    private Product[] myProducts = new Product[0];

    public void save(Product myProd) { // сохранение продукта
        Product[] tmp = new Product[myProducts.length + 1];
        for (int i = 0; i < myProducts.length; i++) {
            tmp[i] = myProducts[i];
        }
        tmp[tmp.length - 1] = myProd;
        myProducts = tmp;
    }

    public Product[] findAll() { //Вывод всех продуктов в порядке добавления
        return myProducts;
    }

    public void RemoveById(int id) { //удаляет продукт из репо по идентификатору
        Product[] tmp = new Product[myProducts.length - 1];
        int j = 0;
        for (int i = 0; i < myProducts.length; i++) {
            if (myProducts[i].getId() != id) {
                tmp[j] = myProducts[i];
                j++;
            }
        }
        myProducts = tmp;
    }

}
