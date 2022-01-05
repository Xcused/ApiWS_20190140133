/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikumnow.praktnow;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/databarang")
public class pendataanrtJpaController {

    @Autowired
    private datarepo pendataanrt;

    @GetMapping("/pendataan")
    public List<pendataanrt> getAllpendataan() {
        return pendataanrt.findAll();
    }

    @GetMapping("/pendataan/{KTP}")
    public pendataanrt getNameById(@PathVariable String ktp) {
        return pendataanrt.findById(ktp).get();
    }

    @PostMapping("/pendataan")
    public pendataanrt saveCoffeeshopDetails(@RequestBody pendataanrt c) {
        return pendataanrt.save(c);
    }

    @PutMapping("/pendataan")
    public pendataanrt updateCoffeeshop(@RequestBody pendataanrt c) {
        return pendataanrt.save(c);
    }

    @DeleteMapping("/pendataan/{KTP}")
    public ResponseEntity<HttpStatus> deleteCoffeeshopById(@PathVariable String KTP) {
        pendataanrt.deleteById(KTP);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


