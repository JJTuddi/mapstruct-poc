package org.example.data.mapper;

import org.example.data.dto.MentorDto;
import org.example.data.entity.MentorEntity;
import org.mapstruct.*;

@Mapper
public interface MentorMapper {

    MentorDto entityToDto(MentorEntity entity);

    MentorEntity dtoToEntity(MentorDto dto);

}
