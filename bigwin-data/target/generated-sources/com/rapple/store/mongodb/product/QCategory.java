package com.rapple.store.mongodb.product;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QCategory extends BeanPath<Category> {

    private static final long serialVersionUID = -409313409;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCategory category = new QCategory("category");

    public final QCategory firstLevel;

    public final StringPath name = createString("name");

    public final QCategory secondLevel;

    public QCategory(String variable) {
        this(Category.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QCategory(Path<? extends Category> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCategory(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCategory(PathMetadata<?> metadata, PathInits inits) {
        this(Category.class, metadata, inits);
    }

    public QCategory(Class<? extends Category> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.firstLevel = inits.isInitialized("firstLevel") ? new QCategory(forProperty("firstLevel"), inits.get("firstLevel")) : null;
        this.secondLevel = inits.isInitialized("secondLevel") ? new QCategory(forProperty("secondLevel"), inits.get("secondLevel")) : null;
    }

}

