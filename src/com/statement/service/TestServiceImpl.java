package com.statement.service;

import com.statement.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {
@Autowired
    private TestDao testDao;
    @Override
    public void test() {
        String deleteSql="delete from user";
        String saveSql="insert into user values(?,?,?)";
        Object param[]={1,"chenheng","男"};
        testDao.delete(deleteSql,null);
        testDao.save(saveSql,param);
        testDao.save(saveSql,param);

    }
}
