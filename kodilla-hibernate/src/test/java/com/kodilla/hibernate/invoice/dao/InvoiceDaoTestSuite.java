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

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Carrot");
        Product product2 = new Product("Apple");
        Item item1 = new Item(new BigDecimal(10), 3, new BigDecimal(30));
        Item item2 = new Item(new BigDecimal(3), 2, new BigDecimal(6));
        Invoice invoice = new Invoice("01/012021");
        item1.setProduct(product1);
        item2.setProduct(product2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int invoiceItemsQuanitty = invoice.getItems().size();

        //Then
        assertNotEquals(0, invoiceId);
        assertEquals(2, invoiceItemsQuanitty);
        assertEquals(item1, invoice.getItems().get(0));
        assertEquals(product2.getName(), item2.getProduct().getName() );

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }

}
