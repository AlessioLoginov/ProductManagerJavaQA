package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RepoTest {

    Product myProduct1 = new Product(1, "Название товара", 100);
    Book myBook1 = new Book(2, "Моя книга", 50, "Писатель");
    Smartphone myPhone1 = new Smartphone(3, "Мой смартфон", 40_000, "Яблоко");

    @Test

    public void testSaveProduct() { //тест сохранения продукта
        Repository repo = new Repository();
        repo.save(myProduct1);
        repo.save(myBook1);
        repo.save(myPhone1);
        Product[] expected = {myProduct1, myBook1, myPhone1};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testRemoveById() { //тест функции удаления продукта по ID
        Repository repo = new Repository();
        repo.save(myProduct1);
        repo.save(myBook1);
        repo.save(myPhone1);
        repo.RemoveById(2);
        Product[] expected = {myProduct1, myPhone1};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}



