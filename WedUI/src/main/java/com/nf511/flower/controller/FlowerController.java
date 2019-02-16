package com.nf511.flower.controller;

import com.nf511.flower.common.R;
import com.nf511.flower.entity.Flower;
import com.nf511.flower.service.FlowerService;
import com.nf511.flower.service.FlowertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Flower")
public class FlowerController {

    @Autowired
    FlowerService flowerService;

    @RequestMapping("/getFlower")
    @ResponseBody
    public R getFlower(Flower flower){
        return R.ok(flowerService.getFlower(flower));
    }

}
