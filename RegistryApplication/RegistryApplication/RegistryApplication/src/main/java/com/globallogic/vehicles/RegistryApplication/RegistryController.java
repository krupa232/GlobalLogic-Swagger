package com.globallogic.vehicles.RegistryApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/registry")
@Slf4j
public class RegistryController {

    List<VehicleSO> vCollection = new ArrayList<>();

    @GetMapping("/{vin}")
    public VehicleSO get(@PathVariable(name = "vin") String vin)
    {
        VehicleSO v = new VehicleSO();
        v.setVin(vin);
        v.setModel("Arteon");
        v.setBrand("VW");
        v.setProductionYear(2022);
        log.info("Returning vehicle with vin: {}", vin);
        return v;

    }


}
//Add swagger documentation