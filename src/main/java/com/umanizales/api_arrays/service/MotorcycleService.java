package com.umanizales.api_arrays.service;

import com.umanizales.api_arrays.model.Motorcycle;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class MotorcycleService {
    private List<Motorcycle> motorcycleList;

    public MotorcycleService(){
        motorcycleList = new ArrayList<>();
    }
    //Crud
    public void addMotorcycle(Motorcycle motorcycle)
    {
        //Detectar si ya existe - Manejar Excepciones
        motorcycleList.add(motorcycle);
    }
    public Motorcycle getMotorcycleByLicensePlate(String licensePlate)
    {
        //Recorrer el listado de motocicletas buscar por placa y retornarlos
        return motorcycleList.stream().filter(
                motorcycle -> motorcycle.getLicenseplate().equals(licensePlate)).findFirst().orElse(null);
    }

}
