package org.example.data.mapper;

import javax.annotation.Generated;
import org.example.data.dto.InternDto;
import org.example.data.dto.InternDto.InternDtoBuilder;
import org.example.data.dto.MentorDto;
import org.example.data.dto.MentorDto.MentorDtoBuilder;
import org.example.data.entity.InternEntity;
import org.example.data.entity.InternEntity.InternEntityBuilder;
import org.example.data.entity.MentorEntity;
import org.example.data.entity.MentorEntity.MentorEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-10T16:28:22+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Amazon.com Inc.)"
)
public class MentorMapperImpl implements MentorMapper {

    @Override
    public MentorDto entityToDto(MentorEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MentorDtoBuilder<?, ?> mentorDto = MentorDto.builder();

        mentorDto.myAwesomeIntern( internEntityToInternDto( entity.getIntern() ) );
        mentorDto.id( entity.getId() );
        mentorDto.birthDate( entity.getBirthDate() );
        mentorDto.firstName( entity.getFirstName() );
        mentorDto.lastName( entity.getLastName() );
        mentorDto.username( entity.getUsername() );
        mentorDto.internshipRepo( entity.getInternshipRepo() );

        return mentorDto.build();
    }

    @Override
    public MentorEntity dtoToEntity(MentorDto dto) {
        if ( dto == null ) {
            return null;
        }

        MentorEntityBuilder mentorEntity = MentorEntity.builder();

        mentorEntity.intern( internDtoToInternEntity( dto.getMyAwesomeIntern() ) );
        mentorEntity.id( dto.getId() );
        mentorEntity.birthDate( dto.getBirthDate() );
        mentorEntity.firstName( dto.getFirstName() );
        mentorEntity.lastName( dto.getLastName() );
        mentorEntity.username( dto.getUsername() );
        mentorEntity.internshipRepo( dto.getInternshipRepo() );

        return mentorEntity.build();
    }

    protected InternDto internEntityToInternDto(InternEntity internEntity) {
        if ( internEntity == null ) {
            return null;
        }

        InternDtoBuilder<?, ?> internDto = InternDto.builder();

        internDto.id( internEntity.getId() );
        internDto.birthDate( internEntity.getBirthDate() );
        internDto.firstName( internEntity.getFirstName() );
        internDto.lastName( internEntity.getLastName() );
        internDto.username( internEntity.getUsername() );
        internDto.internshipNotebook( internEntity.getInternshipNotebook() );
        internDto.workingHours( internEntity.getWorkingHours() );

        return internDto.build();
    }

    protected InternEntity internDtoToInternEntity(InternDto internDto) {
        if ( internDto == null ) {
            return null;
        }

        InternEntityBuilder internEntity = InternEntity.builder();

        internEntity.id( internDto.getId() );
        internEntity.birthDate( internDto.getBirthDate() );
        internEntity.firstName( internDto.getFirstName() );
        internEntity.lastName( internDto.getLastName() );
        internEntity.username( internDto.getUsername() );
        internEntity.internshipNotebook( internDto.getInternshipNotebook() );
        internEntity.workingHours( internDto.getWorkingHours() );

        return internEntity.build();
    }
}
