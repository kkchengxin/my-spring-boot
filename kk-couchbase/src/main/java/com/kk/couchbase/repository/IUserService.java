package com.kk.couchbase.repository;

import org.springframework.data.couchbase.core.query.Dimensional;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.kk.couchbase.entity.User;
import org.springframework.data.geo.Box;

import java.util.List;

/**
 * Created by chengxin on 2017/6/22.
 */
//@ViewIndexed(designDoc = "user", viewName = "all")
public interface IUserService extends CouchbaseRepository<User, String>  {


    /**
     * Additional custom finder method, backed by an auto-generated
     * N1QL query.
     */
    List<User> findByUserNameAndAgeBetween(String userName, int minAge, int maxAge);

    /**
     * Additional custom finder method, backed by a View that indexes
     * the names.
     */
//    @View(designDocument = "user", viewName = "byUserName")
    List<User> findByUserName(String userName);

    /**
     * Additional custom finder method, backed by a geospatial view and
     * allowing multi-dimensional queries.
     * You can also query within a Circle or a Polygon.
     */
    @Dimensional(designDocument = "userGeo", spatialViewName = "byLocation")
    List<User> findByLocationWithin(Box cityBoundingBox);
}
