package com.example.symbolexcusesws.service;

import com.example.symbolexcusesws.dao.ExcuseDao;
import com.example.symbolexcusesws.repository.ExcuseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExcuseServiceImpl implements ExcuseService {

    private final ExcuseRepository excuseRepository;

    @Override
    public List<ExcuseDao> getAllExcuses() {
        return excuseRepository.findAll();
    }

    @Override
    public ExcuseDao addExcuse(ExcuseDao excuseDao) {
        return excuseRepository.save(excuseDao);
    }

}
