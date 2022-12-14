package by.tms.service;

import by.tms.dao.HibernateDao;
import by.tms.entity.Lesson;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LessonService {
    @Qualifier("HibernateLessonDao")
    private final HibernateDao<Lesson, Long> hibernateLessonDao;

    public LessonService(HibernateDao<Lesson, Long> hibernateLessonDao) {
        this.hibernateLessonDao = hibernateLessonDao;
    }

    @Transactional
    public Lesson save(Lesson lesson) {
        hibernateLessonDao.save(lesson);
        return lesson;
    }

    @Transactional(readOnly = true)
    public List<Lesson> findAll() {
        return hibernateLessonDao.findAll();
    }

    @Transactional(readOnly = true)
    public Lesson findByLessonTheme(String theme) {
        return hibernateLessonDao.findByParameter(theme);
    }
    @Transactional
    public Lesson update(Lesson lesson){
        return hibernateLessonDao.update(lesson);
    }
    @Transactional(readOnly = true)
    public List<Lesson> findLessonsByTeacherSurname(String surname){
        return hibernateLessonDao.findAllByParameter(surname);
    }
}
