package com.umanizales.api_arrays.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Motorcycle {
    private String licenseplate;
    private String color;
    private short model;
}
