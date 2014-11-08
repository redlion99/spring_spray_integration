package com.rapple.store.mongodb.core.user;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QResource is a Querydsl query type for Resource
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QResource extends BeanPath<Resource> {

    private static final long serialVersionUID = 708632228;

    public static final QResource resource = new QResource("resource");

    public final StringPath name = createString("name");

    public QResource(String variable) {
        super(Resource.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QResource(Path<? extends Resource> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QResource(PathMetadata<?> metadata) {
        super(Resource.class, metadata);
    }

}

