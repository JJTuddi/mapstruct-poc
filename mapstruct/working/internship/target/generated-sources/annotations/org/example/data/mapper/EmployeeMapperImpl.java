package org.example.data.mapper;

import javax.annotation.Generated;
import org.example.data.dto.EmployeeDto;
import org.example.data.dto.EmployeeDto.EmployeeDtoBuilder;
import org.example.data.entity.EmployeeEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-05T20:07:48+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Amazon.com Inc.)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto entityToDto(EmployeeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDtoBuilder<?, ?> employeeDto = EmployeeDto.builder();

        employeeDto.id( entity.getId() );
        employeeDto.birthDate( entity.getBirthDate() );
        employeeDto.firstName( entity.getFirstName() );
        employeeDto.lastName( entity.getLastName() );
        employeeDto.username( entity.getUsername() );
        employeeDto.password( entity.getPassword() );

        return employeeDto.build();
    }

    @Override
    public EmployeeEntity dtoToEntity(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setId( dto.getId() );
        employeeEntity.setBirthDate( dto.getBirthDate() );
        employeeEntity.setFirstName( dto.getFirstName() );
        employeeEntity.setLastName( dto.getLastName() );
        employeeEntity.setUsername( dto.getUsername() );
        employeeEntity.setPassword( dto.getPassword() );

        return employeeEntity;
    }
}
