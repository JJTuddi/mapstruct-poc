package org.example.data.mapper;

import org.example.data.dto.InternDto;
import org.example.data.entity.InternEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InternMapper {

    @Mapping(target = "lastDay", ignore = true)
    InternDto entityToDto(InternEntity entity);

    @Mapping(target = "lastDay", ignore = true)
    InternEntity dtoToEntity(InternDto dto);

}
