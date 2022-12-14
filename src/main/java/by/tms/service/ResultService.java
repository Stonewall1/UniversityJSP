package by.tms.service;

import by.tms.dao.HibernateDao;
import by.tms.entity.Result;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class ResultService {
    @Qualifier("HibernateResultDao")
    private final HibernateDao<Result, Long> hibernateResultDao;

    public ResultService(HibernateDao<Result, Long> hibernateResultDao) {
        this.hibernateResultDao = hibernateResultDao;
    }
    @Transactional
    public Result save(Result result){
        hibernateResultDao.save(result);
        return result;
    }

    @Transactional
    public List<Result> findAll() {
        return hibernateResultDao.findAll();
    }
    @Transactional
    public List<Result> findAllResultsByStudentSurname(String surname){
        return hibernateResultDao.findAllByParameter(surname);
    }
}



