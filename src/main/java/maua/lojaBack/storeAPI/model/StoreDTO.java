package maua.lojaBack.storeAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import maua.lojaBack.storeAPI.modelEntity.StoreEntity;
import reactor.core.publisher.Mono;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDTO {
    private Integer id;
    private String label;
    private List<String> content;

    public static Mono<StoreDTO> fromEntity(StoreEntity storeEntity){
        return Mono.just(storeEntity)
                .flatMap(x->{
                    StoreDTO store = new StoreDTO();
                    store.setId(x.getId());
                    store.setLabel(x.getLabel());
                    store.setContent(x.getContent());
                    return Mono.just(store);
                });
    }
}
