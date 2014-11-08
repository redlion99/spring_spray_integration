package com.rapple.store.mongodb.core;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAbstractDocument is a Querydsl query type for AbstractDocument
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QAbstractDocument extends BeanPath<AbstractDocument> {

    private static final long serialVersionUID = 1457982186;

    public static final QAbstractDocument abstractDocument = new QAbstractDocument("abstractDocument");

    public final NumberPath<java.math.BigInteger> id = createNumber("id", java.math.BigInteger.class);

    public QAbstractDocument(String variable) {
        super(AbstractDocument.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QAbstractDocument(Path<? extends AbstractDocument> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QAbstractDocument(PathMetadata<?> metadata) {
        super(AbstractDocument.class, metadata);
    }

}

