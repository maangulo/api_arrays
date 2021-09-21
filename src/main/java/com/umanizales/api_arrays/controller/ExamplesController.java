package com.umanizales.api_arrays.controller;


import com.umanizales.api_arrays.controller.dto.ObjectReferenceDTO;
import com.umanizales.api_arrays.service.ExamplesService;
import com.umanizales.api_arrays.service.utills.RecursiveUtills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.math.BigInteger;

@RestController
@RequestMapping(path = "examples")
public class ExamplesController {

    @Autowired
    private ExamplesService examplesService;

    @GetMapping("factorial/{number}")
    public ResponseEntity<BigInteger> factorial(@PathVariable BigInteger number)
    {
        RecursiveUtills recursiveUtills = new RecursiveUtills();
        return new ResponseEntity<BigInteger>(recursiveUtills.factorial(number), HttpStatus.OK);
    }

    @GetMapping("reference/primitive/{number}")
    public int validateReferencePrimitive (@PathVariable int number)
    {
        examplesService.modifiedPrimivite(number);
        return number;
    }

    @GetMapping("reference/wrapper/{number}")
    public Integer validateReferenceWrapper (@PathVariable Integer number)
    {
        examplesService.modifiedWrapper(number);
        return number;
    }

    @PostMapping("reference/object")
    public ObjectReferenceDTO validateReferenceObject (
            @RequestBody ObjectReferenceDTO objectReferenceDTO)
    {
        examplesService.modifiedObject(objectReferenceDTO);
        return objectReferenceDTO;
    }
}
