package com.detroitlabs.MuderMystery.data;

import com.detroitlabs.MuderMystery.model.Card;
import com.detroitlabs.MuderMystery.model.UserInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DealManagerTest {

//    @Test   //FAIL
//    void shouldCheckEnvelopeMatch() {
//        DealManager dealManager = new DealManager();
//        List<Card> createEnvelope = dealManager.createEnvelope();
//        List<Card> testEnvelope = dealManager.getEnvelope();
//        UserInput userInput = new UserInput();
//        userInput.setGuessPeopleCard("Bob");
//        userInput.setGuessWeaponCard("Knife");
//        userInput.setGuessLocationCard("Here");
//        String result = dealManager.checkEnvelopeMatch();
//        assertTrue(result.equals("Match found, You Win"));
//    }

    @Test  //PASS
    void should_create_envelope() {
        DealManager dealManager = new DealManager();
        List<Card> result = dealManager.createEnvelope();
        assertEquals(result, dealManager.getEnvelope());
    }

    @Test   //PASS
    void returns_name_of_people_card() {
        DealManager dealManager = new DealManager();
        String results= dealManager.getPeopleCards().get(0).getCardName();
            assertEquals(results, "Harley Quinn");
        }

    @Test  //PASS
    public void getDie() {
        DealManager dealManager = new DealManager();
        int [] arrTest = new int [] {1, 2, 3, 4, 5, 6, 7};
        int[] results = dealManager.getDie();
        assertTrue(Arrays.equals(arrTest, results));

    }


    @Test
    void setDie() {
    }

//    @Test
//    void getListOfPeopleCards() {
//        DealManager dealManager = new DealManager();
//        List<Card> resultPeopleName = dealManager.getPeopleCards();
//        for (Card i : resultPeopleName) {
//            System.out.println(i);
//            assertEquals(resultPeopleName, resultPeopleName.get(0));
//            assertEquals();
//        }
//
//
//    }

    @Test
    void createEnvelope() {
    }

    @Test
    void createDeck() {
    }

    @Test
    void dealHands() {
    }

    @Test
    void clearDeck() {
    }

    @Test
    void clearCompareHand() {
    }

    @Test
    void getPlayerHand() {
    }

    @Test
    void checkEnvelopeMatch() {
    }

    @Test
    void rollDie() {
    }

    @Test
    void checkNextHandMatchAll() {
    }

    @Test
    void checkNextHandMatchPeople() {
    }

    @Test
    void checkNextHandMatchWeapon() {
    }

    @Test
    void checkNextHandMatchLocation() {
    }
}
//
//    @Test
//    void clearDeck() {
//    }
//
//
//    @Test    //FAIL //TODO finish test
//    void shouldCreateEnvelope() {
//        DealManager testEnvelope = new DealManager();
//        List<Card> testList;
//        for (Card card : testEnvelope.createEnvelope()) {
//            String result = card.getCardName();
//            assertEquals(result, "Harley Quinn");
//        }
//    }
