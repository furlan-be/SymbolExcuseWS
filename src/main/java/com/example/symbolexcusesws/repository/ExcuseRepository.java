package com.example.symbolexcusesws.repository;

import com.example.symbolexcusesws.dao.ExcuseDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcuseRepository extends MongoRepository<ExcuseDao, String> {

}
