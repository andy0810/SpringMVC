package com.sun.springmvc.service.impl;

import com.sun.springmvc.entity.Order;
import com.sun.springmvc.dao.OrderDao;
import com.sun.springmvc.service.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author sunzhongshu
 * @since 2020-01-08
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

}
