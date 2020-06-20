package com.mapsyapi.rest.repositories;

import java.util.List;

import com.mongodb.internal.connection.ClusterDescriptionHelper.Predicate;

public interface QueryDslPredicateExecutor<T> {
	
	List<T> findAll(Predicate predicate);

}
