package com.example.symbolexcusesws.service;


import com.example.symbolexcusesws.dao.ExcuseDao;

import java.util.List;

public interface ExcuseService {


    List<ExcuseDao> getAllExcuses();

    ExcuseDao addExcuse(ExcuseDao excuseDao);
}
