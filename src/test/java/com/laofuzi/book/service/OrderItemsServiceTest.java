package com.laofuzi.book.service;

import com.laofuzi.book.BookApplication;
import com.laofuzi.book.entity.OrderItems;
import com.laofuzi.book.entity.response.OrderItemDetailResponse;
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
public class OrderItemsServiceTest {
    @Autowired
        private OrderItemsService orderItemsService;

        @Test
        public void testCase() {
//            //测试订单明细表新增
            OrderItems orderitems = new OrderItems();
            orderitems.setOrderId(1L);
//            orderitems.setBookName("红楼梦");
//            orderitems.setOrderId(2L);
//            orderitems.setQuantity(1);
//            orderitems.setUnitprice(30);
//            OrderItems insert = orderItemsService.insert(orderitems);
//            System.out.println(insert);
//            //测试订单明细表选择
//            OrderItems select = orderItemsService.selectById(1L);
//            System.out.println(select);
//            //测试订单明细表更新
//            OrderItems orderitems1 = new OrderItems();
//            orderitems1.setId(1L);
//            orderitems1.setBookId(1L);
//            orderitems1.setBookName("百年孤独");
//            orderitems1.setOrderId(2L);
//            orderitems1.setQuantity(2);
//            orderitems1.setUnitprice(40);
//            int update = orderItemsService.updateById(orderitems1);
//            System.out.println(update);
//            //测试订单明细表删除
//            int delete = orderItemsService.deleteById(1L);
//            System.out.println(delete);
//            //测试订单明细表查询全部信息
//            List<OrderItems> selectall = orderItemsService.selectAll();
//            System.out.println(selectall);
//            //测试根据订单id查询订单明细
//            OrderItems order = new OrderItems();
//            order.setOrderId(1l);
//            List<OrderItems> find = orderItemsService.selectByOrderId(order);
//            System.out.println(find);
            //测试订单更详细的信息
            List<OrderItemDetailResponse> orderitem= orderItemsService.selectDetailByOrderId(orderitems);
            System.out.println(orderitem);
        }
}

