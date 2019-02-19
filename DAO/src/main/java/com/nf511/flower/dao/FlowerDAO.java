package com.nf511.flower.dao;

import com.nf511.flower.entity.Flower;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowerDAO {

    List<Flower> getFlower( Flower flower);

    int getFlowerCount(Flower flower);

    int insertFlower(Flower flower);

    int UpdateFlowerStateId(@Param("flowerId") long flowerId, @Param("stateId") long stateId);

    int updateFlower(Flower flower);


}
