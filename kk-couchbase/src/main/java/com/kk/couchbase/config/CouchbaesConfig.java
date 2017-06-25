package com.kk.couchbase.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.util.StringUtils;

/**
 * springdata couchBase配置
 * 参考https://spring.io/blog/2015/03/16/getting-started-with-couchbase-and-spring-data-couchbase
 * Created by chengxin on 2017/6/23.
 */

@Configuration
@EnableCouchbaseRepositories
public class CouchbaesConfig extends AbstractCouchbaseConfiguration {

    @Value("${spring.couchbase.bucket.name}")
    private String bucketName;

    @Value("${spring.couchbase.bucket.password}")
    private String password;

    @Value("${spring.couchbase.bootstrap-host}")
    private String hosts;

    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList(this.hosts);
    }

    @Override
    protected String getBucketName() {
        return this.bucketName;
    }

    @Override
    protected String getBucketPassword() {
        return StringUtils.isEmpty(this.password) ? null : this.password;
    }
}
