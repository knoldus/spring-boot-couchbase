package com.knoldus.blogs;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Collections;
import java.util.List;

@Configuration
public class Config extends AbstractCouchbaseConfiguration {
    
    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }
    
    @Override
    protected String getBucketName() {
        return "blog";
    }
    
    @Override
    protected String getBucketPassword() {
        return "knoldus";
    }
    
    @Override
    protected String getUsername() {
        return "Administrator";
    }
}


