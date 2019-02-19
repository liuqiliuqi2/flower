package com.nf511.flower.service;

import com.nf511.flower.entity.Flower;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowerService {

    List<Flower> getFlower(Flower flower);

    int getFlowerCount(Flower flower);

    int insertFlower(Flower flower);

    int UpdateFlowerStateId(@Param("flowerId") int flowerId, @Param("stateId") int stateId);

    int updateFlower(Flower flower);

}
