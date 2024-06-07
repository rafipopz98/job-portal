package com.rafi.jobPortal;

import com.rafi.jobPortal.models.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<PostModel,String> {
}
