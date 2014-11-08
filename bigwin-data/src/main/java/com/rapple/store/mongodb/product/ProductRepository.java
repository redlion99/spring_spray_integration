package com.rapple.store.mongodb.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by libin on 14-11-7.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product,Long>,CrudRepository<Product, Long>, QueryDslPredicateExecutor<Product> {

    /**
     * Returns a {@link Page} of {@link Product}s having a description which contains the given snippet.
     *
     * @param description
     * @param pageable
     * @return
     */
    Page<Product> findByDescriptionContaining(String description, Pageable pageable);

    /**
     * Returns all {@link Product}s having the given attribute.
     *
     * @param key
     * @return
     */
    @Query("{ ?0 : ?1 }")
    List<Product> findByAttributes(String key, String value);

    Product save(Product product);
}
