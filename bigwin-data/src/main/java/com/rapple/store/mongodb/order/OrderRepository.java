package com.rapple.store.mongodb.order;

import com.rapple.store.mongodb.core.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by libin on 14-11-7.
 */
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    /**
     * Returns all {@link Order}s of the given {@link Customer}.
     *
     * @param customer
     * @return
     */
    List<Order> findByCustomer(Customer customer);
}
