package cometiya.fgisp.poc.istio.eso.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Characteristic {
    private Long id;
    private String name;
    private String description;

    public Characteristic(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}


