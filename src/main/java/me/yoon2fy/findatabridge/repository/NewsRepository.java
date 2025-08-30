package me.yoon2fy.findatabridge.repository;


import me.yoon2fy.findatabridge.domain.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepository extends MongoRepository<News, String> {
}