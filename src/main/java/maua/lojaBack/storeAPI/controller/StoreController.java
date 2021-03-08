package maua.lojaBack.storeAPI.controller;

import maua.lojaBack.storeAPI.model.StoreDTO;
import maua.lojaBack.storeAPI.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("store")

public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/new")
    public Mono<StoreDTO> postReminder(@RequestBody StoreDTO store){
        return storeService.postReminder(store);
    }

    @GetMapping({"/{id}"})
    public Mono<StoreDTO> getReminder(@PathVariable Integer id){
        return storeService.getReminder(id);
    }

    @PutMapping({"/{id}"})
    public Mono<StoreDTO> updateReminder(@RequestBody StoreDTO store, @PathVariable Integer id){
        return storeService.updateReminder(store, id);
    }

    @DeleteMapping({"/{id}"})
    public Mono<Void> deleteReminder(@PathVariable Integer id){
        return storeService.deleteReminder(id);
    }
}
