package com.detroitlabs.MuderMystery.service;

import com.detroitlabs.MuderMystery.data.List;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ListService {
    public static List fetchListData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.todoist.com/rest/v1/projects/2289156017",
                List.class);

    }
}
