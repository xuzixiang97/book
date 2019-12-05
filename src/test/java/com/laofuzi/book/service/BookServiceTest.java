package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = BookApplication.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testCase() {
        //测试书籍新增
//        Book book = new Book();
//        book.setAuthor("曹雪芹");
//        book.setCategoryId("文学类");
//        book.setDescribe("11");
//        book.setImg("11");
//        book.setName("红楼梦");
//        book.setPublishDate("2002");
//        book.setQuantity(30);
//        book.setPublisher("北京出版社");
//        book.setScore(6);
//        book.setStatus(1);
//        book.setUnitprice(20);
//        book.setExtendField("");
//        Book insert = bookService.insert(book);
//        System.out.println(insert);
//        //测试书籍选择
//        Book select = bookService.selectById(1L);
//        System.out.println(select);
//        //测试书籍更新
//        book.setUnitprice(30);
//        int update = bookService.updateById(book);
//        System.out.println(update);
        //测试书籍删除
//        int delete = bookService.deleteById(12L);
//        System.out.println(delete);
//        //测试书籍查询全部信息
        List<Book> selectall = bookService.selectAll();
        System.out.println(selectall);
//        //测试书籍模糊查询
//        Book book1 = new Book();
//        book1.setName("");
//        book1.setAuthor("曹");
//        List<Book> find  = bookService.findByCondition(book1);
//        System.out.println(find);
     }
}
