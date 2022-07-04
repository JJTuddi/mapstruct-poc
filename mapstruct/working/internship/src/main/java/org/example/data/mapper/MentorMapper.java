package org.example.data.mapper;

import org.example.data.dto.MentorDto;
import org.example.data.entity.MentorEntity;
import org.mapstruct.*;

@Mapper
public interface MentorMapper {

    @Mappings({
            @Mapping(target = "myAwesomeIntern", source = "intern"),
            @Mapping(target = "myAwesomeIntern.lastDay", ignore = true)
    })
    MentorDto entityToDto(MentorEntity entity);

    @Mappings({
            @Mapping(target = "intern", source = "myAwesomeIntern"),
            @Mapping(target = "intern.lastDay", ignore = true)
    })
    MentorEntity dtoToEntity(MentorDto dto);

}
