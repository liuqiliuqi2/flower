package com.nf511.flower.controller;

import com.nf511.flower.common.R;
import com.nf511.flower.entity.Collect;
import com.nf511.flower.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/collect")
public class CollectController {
    @Autowired
    CollectService collectService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllCollect",method = RequestMethod.POST)
    @ResponseBody
    public R selectAllCollect(){
        return R.ok(collectService.selectAllCollect());
    }

}
