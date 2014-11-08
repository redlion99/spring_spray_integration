package com.rapple.store.mongodb.order;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 526039820;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrder order = new QOrder("order");

    public final com.rapple.store.mongodb.core.QAbstractDocument _super = new com.rapple.store.mongodb.core.QAbstractDocument(this);

    public final com.rapple.store.mongodb.core.QCustomer customer;

    //inherited
    public final NumberPath<java.math.BigInteger> id = _super.id;

    public final SetPath<LineItem, QLineItem> lineItems = this.<LineItem, QLineItem>createSet("lineItems", LineItem.class, QLineItem.class, PathInits.DIRECT);

    public final com.rapple.store.mongodb.core.QAddress shippingAddress;

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QOrder(Path<? extends Order> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrder(PathMetadata<?> metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new com.rapple.store.mongodb.core.QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.shippingAddress = inits.isInitialized("shippingAddress") ? new com.rapple.store.mongodb.core.QAddress(forProperty("shippingAddress"), inits.get("shippingAddress")) : null;
    }

}

