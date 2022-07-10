package org.example.data.mapper;

import javax.annotation.Generated;
import org.example.data.dto.EmployeeDto;
import org.example.data.dto.EmployeeDto.EmployeeDtoBuilder;
import org.example.data.dto.MentorDto;
import org.example.data.dto.MentorDto.MentorDtoBuilder;
import org.example.data.entity.EmployeeEntity;
import org.example.data.entity.MentorEntity;
import org.example.data.entity.MentorEntity.MentorEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-10T16:51:53+0300",
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

        return employeeEntity;
    }

    @Override
    public MentorDto entityToDto(MentorEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MentorDtoBuilder<?, ?> mentorDto = MentorDto.builder();

        mentorDto.id( entity.getId() );
        mentorDto.birthDate( entity.getBirthDate() );
        mentorDto.firstName( entity.getFirstName() );
        mentorDto.lastName( entity.getLastName() );
        mentorDto.username( entity.getUsername() );

        return mentorDto.build();
    }

    @Override
    public MentorEntity dtoToEntity(MentorDto dto) {
        if ( dto == null ) {
            return null;
        }

        MentorEntityBuilder mentorEntity = MentorEntity.builder();

        mentorEntity.id( dto.getId() );
        mentorEntity.birthDate( dto.getBirthDate() );
        mentorEntity.firstName( dto.getFirstName() );
        mentorEntity.lastName( dto.getLastName() );
        mentorEntity.username( dto.getUsername() );

        return mentorEntity.build();
    }
}
