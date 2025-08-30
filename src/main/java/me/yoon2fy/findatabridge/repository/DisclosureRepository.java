package me.yoon2fy.findatabridge.repository;

import me.yoon2fy.findatabridge.domain.Disclosure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisclosureRepository extends MongoRepository<Disclosure, String> {
}
