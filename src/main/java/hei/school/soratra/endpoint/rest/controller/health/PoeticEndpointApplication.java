package hei.school.soratra.endpoint.rest.controller.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class PoeticEndpointApplication {

    private Map<String, String> poeticData = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(PoeticEndpointApplication.class, args);
    }

    @PutMapping("/soratra/{id}")
    public ResponseEntity<Void> putPoeticData(@PathVariable String id, @RequestBody String poeticPhrase) {
        poeticData.put(id, poeticPhrase.toLowerCase());
        return ResponseEntity.ok().build();
    }
}