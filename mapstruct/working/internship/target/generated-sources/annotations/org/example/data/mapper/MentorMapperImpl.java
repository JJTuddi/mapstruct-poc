package org.example.data.mapper;

import javax.annotation.Generated;
import org.example.data.dto.MentorDto;
import org.example.data.dto.MentorDto.MentorDtoBuilder;
import org.example.data.entity.MentorEntity;
import org.example.data.entity.MentorEntity.MentorEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-04T16:30:02+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Amazon.com Inc.)"
)
public class MentorMapperImpl implements MentorMapper {

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
        mentorDto.password( entity.getPassword() );

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
        mentorEntity.password( dto.getPassword() );

        return mentorEntity.build();
    }
}
