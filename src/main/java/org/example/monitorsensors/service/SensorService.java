package org.example.monitorsensors.service;

import lombok.RequiredArgsConstructor;
import org.example.monitorsensors.model.Sensor;
import org.example.monitorsensors.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;

    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }

    public Sensor findById(Long id) {
        return sensorRepository.findById(id).orElse(null);
    }

    public Sensor save(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    public void delete(Long id) {
        sensorRepository.deleteById(id);
    }

    public List<Sensor> search(String name, String model) {
        return sensorRepository.findByNameContainingOrModelContaining(name, model);
    }
}
