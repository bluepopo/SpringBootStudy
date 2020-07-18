package zy.code.springboot06mybatis.dao;

import org.apache.ibatis.annotations.*;
import zy.code.springboot06mybatis.domain.Book;

import java.util.List;

@Mapper
public interface BookDao {

    @Select("select * from tb_book")
    public List<Book> findAll();

    @Select("select * from tb_book where id=#{id}")
    public Book findById(int id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//主键自增长
    @Insert("insert into tb_book(id,name)values(#{id},#{name})")
    public void insert(Book book);

    @Delete("delete from tb_book where id=#{id} and name=#{name}")
    public void delete(Book book);

    @Update("update tb_book set name=#{name} where id=#{id}")
    public void update(Book book);

}
