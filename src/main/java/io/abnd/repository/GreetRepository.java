package io.abnd.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import io.abnd.entity.Greeting;

public interface GreetRepository extends CassandraRepository<Greeting> {

	@Query("SELECT * FROM greetings WHERE user= ?0 LIMIT ?1")
	Iterable<Greeting> findByUser(String user, Integer limit);
	@Query("SELECT * FROM greetings WHERE user=?0 AND id<?1 LIMIT ?2")
	Iterable<Greeting> findByUserFrom(String user, UUID from, Integer limit);
	
}
