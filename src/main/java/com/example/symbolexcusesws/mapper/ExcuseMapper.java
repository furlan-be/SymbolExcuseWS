package com.example.symbolexcusesws.mapper;

import com.example.symbolexcusesws.dao.ExcuseDao;
import com.example.symbolexcusesws.dto.ExcuseDto;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ExcuseMapper {

    public ExcuseDto toDto(final ExcuseDao excuseDao) {
        return ExcuseDto.builder()
                .id(excuseDao.getId())
                .httpCode(excuseDao.getHttCode())
                .tag(excuseDao.getTag())
                .message(excuseDao.getMessage())
                .build();
    }

    public List<ExcuseDto> toDtoList(final List<ExcuseDao> excuseDaos) {
        return excuseDaos.stream()
                .map(ExcuseMapper::toDto)
                .toList();
    }

    public ExcuseDao toDao(final ExcuseDto excuseDto) {
        return ExcuseDao.builder()
                .id(excuseDto.getId())
                .httCode(excuseDto.getHttpCode())
                .tag(excuseDto.getTag())
                .message(excuseDto.getMessage())
                .build();
    }

    public List<ExcuseDao> toDaoList(final List<ExcuseDto> excuseDtos) {
        return excuseDtos.stream()
                .map(ExcuseMapper::toDao)
                .toList();
    }


}
