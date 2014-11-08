package com.rapple.store.mongodb.product;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -601401778;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QProduct product = new QProduct("product");

    public final com.rapple.store.mongodb.core.QAbstractDocument _super = new com.rapple.store.mongodb.core.QAbstractDocument(this);

    public final MapPath<String, String, StringPath> attributes = this.<String, String, StringPath>createMap("attributes", String.class, String.class, StringPath.class);

    public final QCategory category;

    public final StringPath description = createString("description");

    public final NumberPath<Float> discount = createNumber("discount", Float.class);

    //inherited
    public final NumberPath<java.math.BigInteger> id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final NumberPath<Float> weight = createNumber("weight", Float.class);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QProduct(Path<? extends Product> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProduct(PathMetadata<?> metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
    }

}

