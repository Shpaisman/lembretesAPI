package maua.lojaBack.storeAPI.service;

import maua.lojaBack.storeAPI.model.StoreDTO;
import maua.lojaBack.storeAPI.modelEntity.StoreEntity;
import maua.lojaBack.storeAPI.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StoreService {

    @Autowired
    private TodoRepository todoRepository;

    public Mono<StoreDTO> getLabel(Integer id){
        return todoRepository.findById(id)
                .flatMap(StoreDTO::fromEntity);
    }

    public Mono<StoreDTO> postReminder(StoreDTO store) {
        return Mono.just(new StoreEntity(store))
                .flatMap(x->{
                    StoreEntity entity = (StoreEntity) x;
                    return todoRepository.save(entity);
                })
                .flatMap(StoreDTO::fromEntity);
    }
}
