package com.umanizales.api_arrays.service;

import com.umanizales.api_arrays.controller.dto.ObjectReferenceDTO;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class ExamplesService {

    public void modifiedPrimivite(int num)
    {
        num=num*5;
    }

    public void modifiedPrimivite (Integer num)
    {
        num=num*5;
    }

    public void modifiedWrapper (Integer num)
    {
        num=num*5;
    }

    public void modifiedObject (ObjectReferenceDTO objectReferenceDTO)
    {
        objectReferenceDTO.setNumber(objectReferenceDTO.getNumber()*5);
    }
}
