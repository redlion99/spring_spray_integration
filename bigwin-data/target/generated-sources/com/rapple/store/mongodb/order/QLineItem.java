package com.rapple.store.mongodb.order;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLineItem is a Querydsl query type for LineItem
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QLineItem extends BeanPath<LineItem> {

    private static final long serialVersionUID = -1129262935;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLineItem lineItem = new QLineItem("lineItem");

    public final com.rapple.store.mongodb.core.QAbstractDocument _super = new com.rapple.store.mongodb.core.QAbstractDocument(this);

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    //inherited
    public final NumberPath<java.math.BigInteger> id = _super.id;

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final com.rapple.store.mongodb.product.QProduct product;

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> unitPrice = createNumber("unitPrice", java.math.BigDecimal.class);

    public QLineItem(String variable) {
        this(LineItem.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QLineItem(Path<? extends LineItem> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLineItem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLineItem(PathMetadata<?> metadata, PathInits inits) {
        this(LineItem.class, metadata, inits);
    }

    public QLineItem(Class<? extends LineItem> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.rapple.store.mongodb.product.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

