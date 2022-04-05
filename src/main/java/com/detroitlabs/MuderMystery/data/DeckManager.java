package com.detroitlabs.MuderMystery.data;


import com.detroitlabs.MuderMystery.model.Card;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class DeckManager {
//List of people cards
//List of weapon cards
//List of Location cards
//List for Player
//List for computer
//List for envelope/solution- use random to select from each list (ppl, wepn, loct)
//List for ALL_CARDS- which will have all 3 lists brought into this one
//List of all cards including the ones in the envelope. ?

//    List<Card> peopleCards = new ArrayList<>();
//    List<Card> weaponCards = new ArrayList<>();
//    List<Card> locationCards = new ArrayList<>();
    List<Card> drawPile = new ArrayList<>();
    List<Card> player1 = new ArrayList<>();
    List<Card> computer1 = new ArrayList<>();
    List<Card> computer2 = new ArrayList<>();
    List<Card> envelope = new ArrayList<>();
    List<Card> allCardsMinEnvelope = new ArrayList<>();
    List<Card> allCardsPlusEnvelope = new ArrayList<>();
    Random rand = new Random();

//    private static final List<Card> ALL_CARDS = Arrays.asList(
//            new Card()


    private static final List<Card> peopleCards = Arrays.asList(
            new Card("Harley Quinn", "p", "Harley"),
            new Card("Grunkle Stan", "p", "Grunkle"),
            new Card("Chowder", "p", "Chowder"),
            new Card("Mike Meyers", "p", "Mike"),
            new Card("Kool Aid Man", "p", "Aid"),
            new Card("Buzz Lightyear", "p", "Buzz"));

    private static final List<Card> weaponCards = Arrays.asList(
            new Card("Bowling Ball", "w", "ball"),
            new Card("Jump rope", "w", "rope"),
            new Card("Plunger", "w", "plunger"),
            new Card("Arsenic", "w", "arsenic"),
            new Card("Pillow", "w", "pillow"),
            new Card("Prosthetic Leg", "w", "leg"));


    private static final List<Card> locationCards = Arrays.asList(
            new Card("Garden of the Gods", "l", "garden"),
            new Card("Ghost Mines", "l", "mines"),
            new Card("Detroit River Front", "l", "river"),
            new Card("The Henry Ford Museum", "l", "museum"),
            new Card("Gunnison National Forest", "l", "forest"),
            new Card("Odyssey Gastropub", "l", "pub"),
            new Card("Cheyenne Mountain Zoo", "l", "zoo"),
            new Card("Ford Lanes Bowling Alley", "l", "bowling"),
            new Card("Sandcreek Library", "l", "library"));



}
