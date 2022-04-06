package com.detroitlabs.MuderMystery.data;

import com.detroitlabs.MuderMystery.model.Card;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckManagerTest {

    @Test    //FAIL
    void shouldCreateEnvelope() {
        DealManager testEnvelope = new DealManager();
        List<Card> testList;
        for (Card card : testEnvelope.createEnvelope()) {
           String result = card.getCardName();
            assertEquals(result, "Harley Quinn");
        }
    }
}