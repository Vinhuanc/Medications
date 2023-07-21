package com.project.ToDoList.service;

import com.project.ToDoList.Model.Medication;
import com.project.ToDoList.mapper.MedicationMapper;
import org.springframework.stereotype.Service;

@Service
public class MedicationService {
    private MedicationMapper mapper;

    public MedicationService(MedicationMapper mapper) {
        this.mapper = mapper;
    }

    public Medication[] getMedications(){
        Medication[] meds = mapper.selectMedication();
        return meds;
    }

    public int addMedication(Medication medication){
       return mapper.insertMedication(medication);
    }

}
