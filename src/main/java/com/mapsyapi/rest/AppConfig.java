package com.mapsyapi.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories
public class AppConfig extends AbstractMongoClientConfiguration {

	public @Bean MongoClient mongoClient() {

		return MongoClients.create(
				"mongodb://admin:admin123@moviesdb-shard-00-00-bofsb.mongodb.net:27017,moviesdb-shard-00-01-bofsb.mongodb.net:27017,moviesdb-shard-00-02-bofsb.mongodb.net:27017/MapsyDB?ssl=true&replicaSet=MoviesDB-shard-0&authSource=admin&retryWrites=true&w=majority");
	}

	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoClient(), "mapsy-places");
	}

	@Override
	protected String getDatabaseName() {
		return "MapsyDB";
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.oreilly.springdata.mongodb";
	}

}
