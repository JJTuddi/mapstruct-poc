package org.example.data.mapper;

import javax.annotation.Generated;
import org.example.data.dto.InternDto;
import org.example.data.dto.InternDto.InternDtoBuilder;
import org.example.data.entity.InternEntity;
import org.example.data.entity.InternEntity.InternEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-05T20:02:17+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Amazon.com Inc.)"
)
public class InternMapperImpl implements InternMapper {

    @Override
    public InternDto entityToDto(InternEntity entity) {
        if ( entity == null ) {
            return null;
        }

        InternDtoBuilder<?, ?> internDto = InternDto.builder();

        internDto.id( entity.getId() );
        internDto.birthDate( entity.getBirthDate() );
        internDto.firstName( entity.getFirstName() );
        internDto.lastName( entity.getLastName() );
        internDto.username( entity.getUsername() );
        internDto.internshipNotebook( entity.getInternshipNotebook() );
        internDto.workingHours( entity.getWorkingHours() );

        return internDto.build();
    }

    @Override
    public InternEntity dtoToEntity(InternDto dto) {
        if ( dto == null ) {
            return null;
        }

        InternEntityBuilder internEntity = InternEntity.builder();

        internEntity.id( dto.getId() );
        internEntity.birthDate( dto.getBirthDate() );
        internEntity.firstName( dto.getFirstName() );
        internEntity.lastName( dto.getLastName() );
        internEntity.username( dto.getUsername() );
        internEntity.internshipNotebook( dto.getInternshipNotebook() );
        internEntity.workingHours( dto.getWorkingHours() );

        return internEntity.build();
    }
}
