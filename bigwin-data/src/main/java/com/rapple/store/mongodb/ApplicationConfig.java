package com.rapple.store.mongodb;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

/**
 * Created by libin on 14-11-7.
 */
@Configuration
@ComponentScan(basePackages="com.rapple.store")
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {

    @Autowired
    private List<Converter<?, ?>> converters;

    @Override
    protected String getDatabaseName() {
        return "estore";
    }

    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new Mongo();
        mongo.setWriteConcern(WriteConcern.SAFE);

        return mongo;
    }

    @Override
    public CustomConversions customConversions() {
        return new CustomConversions(converters);
    }
}
