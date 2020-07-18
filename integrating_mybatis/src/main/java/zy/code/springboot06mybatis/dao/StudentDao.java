package zy.code.springboot06mybatis.dao;

import zy.code.springboot06mybatis.domain.Student;

//@Mapper 或者 @MapperScan 将接口扫描并装配到容器中
public interface StudentDao {

    public Student findById(Integer id);

    public void  insert(Student student);

}
