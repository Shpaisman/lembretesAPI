package maua.lojaBack.storeAPI.repository;

import maua.lojaBack.storeAPI.modelEntity.StoreEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TodoRepository extends ReactiveCrudRepository<StoreEntity, Integer> {
}
