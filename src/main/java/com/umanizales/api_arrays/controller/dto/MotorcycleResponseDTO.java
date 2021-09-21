package com.umanizales.api_arrays.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MotorcycleResponseDTO
{
    private String message;
    private Object data;
    private List<ErrorDTO> errors;

}
