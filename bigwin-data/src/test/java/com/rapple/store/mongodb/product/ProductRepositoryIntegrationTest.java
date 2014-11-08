package com.rapple.store.mongodb.product;

import com.rapple.store.mongodb.AbstractIntegrationTest;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

/**
 * Created by libin on 14-11-7.
 */
public class ProductRepositoryIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    ProductRepository repository;

    @Test
    public void createProduct() {
        //repository=context.getBean(ProductRepository.class);
        Product product = new Product("Camera bag", new BigDecimal(49.99));
        product = repository.save(product);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void lookupProductsByDescription() {

        Pageable pageable = new PageRequest(0, 1, Direction.DESC, "name");
        Page<Product> page = repository.findByDescriptionContaining("Apple", pageable);

//        assertThat(page.getContent(), hasSize(1));
//        assertThat(page, Matchers.<Product> hasItems(named("iPad")));
//        assertThat(page.isFirstPage(), is(true));
//        assertThat(page.isLastPage(), is(false));
//        assertThat(page.hasNextPage(), is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void findsProductsByAttributes() {

        List<Product> products = repository.findByAttributes("attributes.connector", "plug");

//        assertThat(products, Matchers.<Product> hasItems(named("Dock")));
    }

}
