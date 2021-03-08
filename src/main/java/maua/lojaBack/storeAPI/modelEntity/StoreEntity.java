package maua.lojaBack.storeAPI.modelEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import maua.lojaBack.storeAPI.model.StoreDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("store")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreEntity {
    @Id
    @Column("id")
    private Integer id;
    @Column("label")
    private String label;
    @Column("content")
    private List<String> content;

    public StoreEntity(StoreDTO store){
        super();
        this.id = store.getId();
        this.label = store.getLabel();
        this.content = store.getContent();
    }
}
