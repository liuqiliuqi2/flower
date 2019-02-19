package com.nf511.flower.service.Impl;

import com.nf511.flower.dao.FlowerDAO;
import com.nf511.flower.entity.Flower;
import com.nf511.flower.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    FlowerDAO flowerDAO;

    public List<Flower> getFlower(Flower flower) {
        return flowerDAO.getFlower(flower);
    }

    public int getFlowerCount(Flower flower) {
        return flowerDAO.getFlowerCount(flower);
    }

    public int insertFlower(Flower flower) {
        return flowerDAO.insertFlower(flower);
    }

    public int UpdateFlowerStateId(int flowerId, int stateId) {
        return flowerDAO.UpdateFlowerStateId(flowerId, stateId);
    }

    public int updateFlower(Flower flower) {
        return flowerDAO.updateFlower(flower);
    }
}
