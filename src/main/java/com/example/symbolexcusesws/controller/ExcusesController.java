package com.example.symbolexcusesws.controller;

import com.example.symbolexcusesws.dao.ExcuseDao;
import com.example.symbolexcusesws.dto.ExcuseDto;
import com.example.symbolexcusesws.mapper.ExcuseMapper;
import com.example.symbolexcusesws.service.ExcuseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("excuses")
@RequiredArgsConstructor
public class ExcusesController {


    private final ExcuseService excuseService;

    @GetMapping()
    public ResponseEntity<List<ExcuseDto>> getAllExcuses() {
        return new ResponseEntity<>(ExcuseMapper.toDtoList(excuseService.getAllExcuses()), org.springframework.http.HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ExcuseDto> addExcuse(@Valid @RequestBody ExcuseDto excuseDto) {
        final ExcuseDao excuseDao = excuseService.addExcuse(ExcuseMapper.toDao(excuseDto));
        return new ResponseEntity<>(ExcuseMapper.toDto(excuseDao), org.springframework.http.HttpStatus.CREATED);
    }
}
