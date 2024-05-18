package com.aqua.fake.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aqua.fake.entidades.AcquaMarine;
import com.aqua.fake.repositorios.AcquaMarineRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/acquamarine")
public class AcquaMarineController {

    @Autowired
    private AcquaMarineRepository acquaMarineRepository;

    public AcquaMarineController() {
        System.out.println("controler criado");
    }

    @PostMapping("/novo")
    public ResponseEntity<AcquaMarine> createAcquaMarine(@Validated @RequestBody AcquaMarine acquaMarine) {
        AcquaMarine newAcquaMarine = acquaMarineRepository.save(acquaMarine);
        return ResponseEntity.ok(newAcquaMarine);
    }

    @Operation(summary = "Retorna todos os registros")
    @GetMapping("/todos")
    public List<AcquaMarine> getAllAcquaMarine() {
        return acquaMarineRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<AcquaMarine> updateAcquaMarine(@PathVariable(value = "id") Long acquamarineId,
            @Validated @RequestBody AcquaMarine acquaMarineDetails) throws ResourceNotFoundException {
        AcquaMarine acquaMarine = acquaMarineRepository.findById(acquamarineId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "not found Id" + acquamarineId));

        acquaMarine.setId(acquaMarineDetails.getId());
        acquaMarine.setChave(acquaMarineDetails.getChave());
        acquaMarine.setDataHora(acquaMarineDetails.getDataHora());
        acquaMarine.setTemperatura(acquaMarineDetails.getTemperatura());
        acquaMarine.setOxigenio(acquaMarineDetails.getOxigenio());
        acquaMarine.setSaturacao(acquaMarineDetails.getSaturacao());

        final AcquaMarine updateAcquaMarine = acquaMarineRepository.save(acquaMarine);

        return ResponseEntity.ok(updateAcquaMarine);

    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteAcquamarine(@PathVariable(value = "id") Long acquaMarineId)
            throws ResourceNotFoundException {
        AcquaMarine acquaMarine = acquaMarineRepository.findById(acquaMarineId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "not found : : " + acquaMarineId));
        acquaMarineRepository.delete(acquaMarine);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return response;

    }

}
