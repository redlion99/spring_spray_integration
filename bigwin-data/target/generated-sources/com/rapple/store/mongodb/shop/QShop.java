package com.rapple.store.mongodb.shop;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QShop is a Querydsl query type for Shop
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QShop extends EntityPathBase<Shop> {

    private static final long serialVersionUID = 1541636364;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QShop shop = new QShop("shop");

    public final com.rapple.store.mongodb.core.QAbstractDocument _super = new com.rapple.store.mongodb.core.QAbstractDocument(this);

    public final com.rapple.store.mongodb.core.QAddress address;

    //inherited
    public final NumberPath<java.math.BigInteger> id = _super.id;

    public QShop(String variable) {
        this(Shop.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QShop(Path<? extends Shop> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QShop(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QShop(PathMetadata<?> metadata, PathInits inits) {
        this(Shop.class, metadata, inits);
    }

    public QShop(Class<? extends Shop> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new com.rapple.store.mongodb.core.QAddress(forProperty("address"), inits.get("address")) : null;
    }

}

