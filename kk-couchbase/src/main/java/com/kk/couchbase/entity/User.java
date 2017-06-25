package com.kk.couchbase.entity;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * lombok & jpa
 * Created by chengxin on 2017/6/22.
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(expiry = 0)
public class User {
    @Id
    private String id;
    @Field
    private String userName;
    @Field
    private String phone;
    @Field
    private float age;

}
