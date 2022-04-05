package com.detroitlabs.MuderMystery.service;

import com.detroitlabs.MuderMystery.data.List;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ListService {
    public static List fetchListData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.todoist.com/rest/v1/projects/2203306141" +
                        "Authorization: Bearer $ebf8092265231231f2636dd680f2208b45d561c9",
                List.class);

    }
}
