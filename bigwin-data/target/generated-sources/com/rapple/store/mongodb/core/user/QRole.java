package com.rapple.store.mongodb.core.user;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QRole is a Querydsl query type for Role
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRole extends EntityPathBase<Role> {

    private static final long serialVersionUID = 91706892;

    public static final QRole role = new QRole("role");

    public final com.rapple.store.mongodb.core.QAbstractDocument _super = new com.rapple.store.mongodb.core.QAbstractDocument(this);

    //inherited
    public final NumberPath<java.math.BigInteger> id = _super.id;

    public final StringPath name = createString("name");

    public final SetPath<Resource, QResource> resources = this.<Resource, QResource>createSet("resources", Resource.class, QResource.class, PathInits.DIRECT);

    public QRole(String variable) {
        super(Role.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QRole(Path<? extends Role> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QRole(PathMetadata<?> metadata) {
        super(Role.class, metadata);
    }

}

