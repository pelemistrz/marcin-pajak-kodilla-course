package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){
        Product product1 = new Product("Hammer");
        Product product2 = new Product("Nail");
        Product product3 = new Product("Wood");
        Item item1 = new Item(product1, new BigDecimal(100),2);
        Item item2 = new Item(product2, new BigDecimal(1),150);
        Item item3 = new Item(product3, new BigDecimal(150),1);
        Invoice invoice = new Invoice("143/05/2024");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();
        long numberOfItems = itemDao.count();
        long numberOfProducts = productDao.count();


        //then
        assertNotEquals(0,id);
        assertEquals(3,numberOfItems);
        assertEquals(3,numberOfProducts);
        assertEquals(id,invoice.getId());

        //cleanUp
        invoiceDao.deleteById(id);
    }
}
