package cometiya.fgisp.poc.istio.eso.controller;

import cometiya.fgisp.poc.istio.eso.model.Characteristic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serviceSpec/characteristic")
public class CharacteristicController {

    @GetMapping
    public List<Characteristic> retrieve(){

        Characteristic characteristic1 = new Characteristic(1L, "latency", "latency characteristic");
        Characteristic characteristic2 = new Characteristic(2L, "up-link", "up-link characteristic");
        Characteristic characteristic3 = new Characteristic(3L, "down-link", "down-link characteristic");

        List<Characteristic> characteristics = new ArrayList<>();

        characteristics.add(characteristic1);
        characteristics.add(characteristic2);
        characteristics.add(characteristic3);

        return characteristics;
    }
}