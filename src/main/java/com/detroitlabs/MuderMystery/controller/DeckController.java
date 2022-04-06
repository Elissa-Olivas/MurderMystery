package com.detroitlabs.MuderMystery.controller;


import com.detroitlabs.MuderMystery.data.DealManager;
import com.detroitlabs.MuderMystery.data.List;
import com.detroitlabs.MuderMystery.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class DeckController {


    @Autowired
    DealManager dealer = new DealManager();

    //    @RequestMapping("/")
//    public String displayHomepage(){
//        dealer.clearDeck();
//        dealer.dealHands();
//        return "home";
//    }
    @RequestMapping("/")
    public String displayListServiceDetails(ModelMap modelMap) throws IOException {
        List listService = ListService.fetchListData();
        modelMap.put("order", listService.getOrder());
        modelMap.put("color", listService.getColor());
        modelMap.put("name", listService.getName());
        modelMap.put("count", listService.getComment_count());
        modelMap.put("syncID", listService.getSync_id());
        modelMap.put("url", listService.getUrl());
        return "home";
    }
}
