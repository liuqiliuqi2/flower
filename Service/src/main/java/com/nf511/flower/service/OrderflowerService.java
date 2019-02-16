package com.nf511.flower.service;


import com.nf511.flower.entity.Orderflower;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderflowerService {
    List<Orderflower> selectAllOrderflower();
    Orderflower selectAllOrderflowerId(@Param("orderflowerId") int orderflowerId);
    List<Orderflower>selectAllOrderflowerByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertOrderflower(Orderflower orderflower);
    int updateOrderflower(Orderflower orderflower);
    int deleteOrderflower(@Param("orderflowerId") int orderflowerId);
    int deleteAll(@Param("orderflowerIds") List<Integer> items);
}
