package com.detroitlabs.MuderMystery.controller;


import com.detroitlabs.MuderMystery.data.DealManager;
import com.detroitlabs.MuderMystery.data.List;
import com.detroitlabs.MuderMystery.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeckController {


    @Autowired
    DealManager dealer = new DealManager();

    @Autowired
    List list = new List();

//    @RequestMapping("/")
//    public String displayHomepage(){
//        dealer.clearDeck();
//        dealer.dealHands();
//        return "home";
//    }

    @RequestMapping("/")
    public String displayListServiceDetails(ModelMap modelMap) {
        List listService = ListService.fetchListData();
        modelMap.put("listService", listService);
        return "home";
    }
}
