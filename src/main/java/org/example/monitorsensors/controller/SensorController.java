package org.example.monitorsensors.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.monitorsensors.model.Sensor;
import org.example.monitorsensors.service.SensorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorService sensorService;

    @GetMapping
    public List<Sensor> getAllSensors(@RequestParam(required = false) String name, @RequestParam(required = false) String model) {
        if (name != null || model != null) {
            return sensorService.search(name, model);
        }
        return sensorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sensor> getSensorById(@PathVariable Long id) {
        Sensor sensor = sensorService.findById(id);
        return sensor != null ? ResponseEntity.ok(sensor) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Sensor createSensor(@Valid @RequestBody Sensor sensor) {
        return sensorService.save(sensor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sensor> updateSensor(@PathVariable Long id, @Valid @RequestBody Sensor sensorDetails) {
        Sensor sensor = sensorService.findById(id);
        if (sensor == null) {
            return ResponseEntity.notFound().build();
        }
        sensor.setName(sensorDetails.getName());
        sensor.setModel(sensorDetails.getModel());
        sensor.setRange(sensorDetails.getRange());
        sensor.setType(sensorDetails.getType());
        sensor.setUnit(sensorDetails.getUnit());
        sensor.setLocation(sensorDetails.getLocation());
        sensor.setDescription(sensorDetails.getDescription());
        return ResponseEntity.ok(sensorService.save(sensor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensor(@PathVariable Long id) {
        if (sensorService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        sensorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
