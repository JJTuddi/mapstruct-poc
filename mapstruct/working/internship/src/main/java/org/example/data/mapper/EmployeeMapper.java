package org.example.data.mapper;

import org.example.data.dto.EmployeeDto;
import org.example.data.dto.MentorDto;
import org.example.data.entity.EmployeeEntity;
import org.example.data.entity.MentorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    EmployeeDto entityToDto(EmployeeEntity entity);
    EmployeeEntity dtoToEntity(EmployeeDto dto);

    MentorDto entityToDto(MentorEntity entity);
    MentorEntity dtoToEntity(MentorDto dto);

}