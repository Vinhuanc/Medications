package com.project.ToDoList.mapper;

import com.project.ToDoList.Model.Medication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MedicationMapper {
    @Select("select * from Medication")
    Medication[] selectMedication();

    @Insert("Insert into Medication (id, genericName, brandName, mainPurpose) values (#{id},#{genericName}, #{brandName}, #{mainPurpose})")
    int insertMedication(Medication medication);

}
