package com.detroitlabs.MuderMystery.controller;


import com.detroitlabs.MuderMystery.data.DealManager;
import com.detroitlabs.MuderMystery.data.List;
import com.detroitlabs.MuderMystery.service.ListService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class DeckController {


    @Autowired
    DealManager dealer = new DealManager();

        @RequestMapping("/")
    public String displayHomepage(ModelMap modelMap){
        dealer.clearDeck();
        dealer.createDeck();
        dealer.dealHands();
        modelMap.put("envelope", dealer.createEnvelope());
        return "home";
    }
    @RequestMapping("/player1")
    public String displayPlayer1(ModelMap modelMap) throws IOException {
            //access to hands
        modelMap.put("player1Hand", dealer.getPlayerHand(1));
        //access to roll dice
        modelMap.put("rollDie", dealer.getDie());
        List listService = ListService.fetchListData();
        modelMap.put("order", listService.getOrder());
        modelMap.put("color", listService.getColor());
        modelMap.put("name", listService.getName());
        modelMap.put("count", listService.getComment_count());
        modelMap.put("syncID", listService.getSync_id());
        modelMap.put("url", listService.getUrl());
        return "player1";
    }

    @RequestMapping("/computer1")
    public String displayComputer1(ModelMap modelMap) throws IOException {
        //access to hands
        modelMap.put("computer1Hand", dealer.getPlayerHand(2));
        //access to roll dice
        modelMap.put("rollDie", dealer.getDie());
        List listService = ListService.fetchListData();
        modelMap.put("order", listService.getOrder());
        modelMap.put("color", listService.getColor());
        modelMap.put("name", listService.getName());
        modelMap.put("count", listService.getComment_count());
        modelMap.put("syncID", listService.getSync_id());
        modelMap.put("url", listService.getUrl());
        return "computer1";
    }

    @RequestMapping("/computer2")
    public String displayComputer2(ModelMap modelMap) throws IOException {
        //access to hands
        modelMap.put("computer2Hand", dealer.getPlayerHand(3));
        //access to roll dice
        modelMap.put("rollDie", dealer.getDie());
        List listService = ListService.fetchListData();
        modelMap.put("order", listService.getOrder());
        modelMap.put("color", listService.getColor());
        modelMap.put("name", listService.getName());
        modelMap.put("count", listService.getComment_count());
        modelMap.put("syncID", listService.getSync_id());
        modelMap.put("url", listService.getUrl());
        return "computer2";
    }


    @RequestMapping("/suggest")
    public String displaySuggestPage (ModelMap modelMap) {
        modelMap.put("checkNextHandMatchAll", dealer.checkNextHandMatchAll());
        modelMap.put("checkNextHandMatchPeople", dealer.checkNextHandMatchPeople());
        modelMap.put("checkNextHandMatchWeapon", dealer.checkNextHandMatchWeapon());
        modelMap.put("checkNextHandMatchLocation", dealer.checkNextHandMatchLocation());
        dealer.clearCompareHand();
        return "suggest";
    }


    @RequestMapping("/accuse")
    public String displayAccusePage (ModelMap modelMap) {
        modelMap.put("checkEnvelopeMatch", dealer.checkEnvelopeMatch());
        return "accuse";
    }


    @RequestMapping("/results")
    public String displayResults (ModelMap modelMap) {
        modelMap.put("checkEnvelopeMatch", dealer.checkEnvelopeMatch());
        return "results";
    }

}
