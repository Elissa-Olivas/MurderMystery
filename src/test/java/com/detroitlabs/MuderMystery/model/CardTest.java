package com.detroitlabs.MuderMystery.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    private Card testCard;
    @BeforeEach
        void newCard() {
        testCard = new Card("test", "t", "testing");
    }

    @Test   //PASS
    void getCardName() {
        String result = testCard.getCardName();
        assertEquals(result, "test");

    }

    @Test    //PASS
    void testSetter_setsCardName_Properly() throws NoSuchFieldException, IllegalAccessException {
        //when
        testCard.setCardName("Bob");
        //then
        final Field field = testCard.getClass().getDeclaredField("cardName");
        field.setAccessible(true);
        assertEquals("Bob", field.get(testCard), "Bob");
    }

    @Test   //PASS
    void getIdentifier() {
        String results = testCard.getIdentifier();
        assertEquals(results, "t");
    }

    @Test    //PASS
    void testSetter_setsIdentifier_Properly() throws NoSuchFieldException, IllegalAccessException {
        //when
        testCard.setIdentifier("B");
        //then
        final Field field = testCard.getClass().getDeclaredField("identifier");
        field.setAccessible(true);
        assertEquals("B", field.get(testCard), "B");
    }

    @Test   //PASS
    void getPicName() {
        String results = testCard.getPicName();
        assertEquals(results, "testing");
    }

    @Test   //PASS
    void testSetter_setsPicName_Properly() throws NoSuchFieldException, IllegalAccessException {
        //when
        testCard.setPicName("Bob");
        //then
        final Field field = testCard.getClass().getDeclaredField("picName");
        field.setAccessible(true);
        assertEquals("Bob", field.get(testCard), "Bob");
    }

}