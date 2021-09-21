package com.umanizales.api_arrays.controller;

import com.umanizales.api_arrays.controller.dto.MotorcycleResponseDTO;
import com.umanizales.api_arrays.model.Motorcycle;
import com.umanizales.api_arrays.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="motorcycle")
public abstract class MotorcycleController {
    @Autowired
    private MotorcycleService motorcycleService;

    @GetMapping
    public @ResponseBody
    ResponseEntity<MotorcycleResponseDTO> getMessage()
    {
        return new ResponseEntity<MotorcycleResponseDTO>(
                new MotorcycleResponseDTO("success", "Hola Champions", null), HttpStatus.OK
        );
    }

    @GetMapping("/second")
    public String getSecondMessage()
    {
        return "Hola Champions 2";
    }

    @GetMapping("/{message1}/{message2}")
    public String getDynamicMessage(@PathVariable String message1, @PathVariable String message2)
    {
        return message1+" "+message2;
    }
    
    @GetMapping("/list")
    public @ResponseBody
    ResponseEntity<MotorcycleResponseDTO> getMotorcycleList()
    {
        return new ResponseEntity<MotorcycleResponseDTO>(
                new MotorcycleResponseDTO("success", motorcycleService.getMotorcycleList(),null
                ),HttpStatus.OK
        );
    }

    @GetMapping("/list/{licensePlate}")
    public @ResponseBody
    ResponseEntity<MotorcycleResponseDTO> getMotorcycleByLicensePlate(@PathVariable String licensePlate)
    {
        return new ResponseEntity<MotorcycleResponseDTO>(
                new MotorcycleResponseDTO("success",
                        motorcycleService.getMotorcycleByLicensePlate(licensePlate),
                        null),HttpStatus.OK
        );
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<MotorcycleResponseDTO> getsaveMotorcycle(@RequestBody Motorcycle motorcycle)
    {
       return new ResponseEntity<MotorcycleResponseDTO>(
               new MotorcycleResponseDTO("success", motorcycleService.getMotorcycleList(),null
               ),HttpStatus.OK
       );
    }
}
