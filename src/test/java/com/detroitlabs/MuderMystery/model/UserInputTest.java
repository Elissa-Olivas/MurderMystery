package com.detroitlabs.MuderMystery.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {
    private UserInput userInput;
    @BeforeEach
    void newUserInput() {
        userInput = new UserInput();
    }


    @Test
    void getGuessPeopleCard() {
        userInput.setGuessPeopleCard("Bob");
        String result = userInput.getGuessPeopleCard();
        assertEquals(result, "Bob");
    }

    @Test
    void setGuessPeopleCard() throws NoSuchFieldException, IllegalAccessException {
        //when
        userInput.setGuessPeopleCard("Bob");
        //then
        final Field field = userInput.getClass().getDeclaredField("guessPeopleCard");
        field.setAccessible(true);
        assertEquals("Bob", field.get(userInput), "Bob");
    }

    @Test
    void getGuessWeaponCard() {
        userInput.setGuessWeaponCard("Knife");
        String result = userInput.getGuessWeaponCard();
        assertEquals(result, "Knife");
    }

    @Test
    void setGuessWeaponCard() throws NoSuchFieldException, IllegalAccessException {
        //when
        userInput.setGuessWeaponCard("Knife");
        //then
        final Field field = userInput.getClass().getDeclaredField("guessWeaponCard");
        field.setAccessible(true);
        assertEquals("Knife", field.get(userInput), "Knife");
    }

    @Test
    void getGuessLocationCard() {
        userInput.setGuessLocationCard("Here");
        String result = userInput.getGuessLocationCard();
        assertEquals(result, "Here");
    }

    @Test
    void setGuessLocationCard() throws NoSuchFieldException, IllegalAccessException {
        //when
        userInput.setGuessLocationCard("Here");
        //then
        final Field field = userInput.getClass().getDeclaredField("guessLocationCard");
        field.setAccessible(true);
        assertEquals("Here", field.get(userInput), "Here");
    }
}