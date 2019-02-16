package com.nf511.flower.dao;

import com.nf511.flower.entity.Flower;

import java.util.List;

public interface FlowerDAO {

    List<Flower> getFlower( Flower flower);

    int getFlowerCount(Flower flower);



}
