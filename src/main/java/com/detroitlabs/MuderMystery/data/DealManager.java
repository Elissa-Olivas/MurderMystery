package com.detroitlabs.MuderMystery.data;


import com.detroitlabs.MuderMystery.model.Card;
import com.detroitlabs.MuderMystery.model.UserInput;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.List;

@Component
public class DealManager {


    UserInput userInput = new UserInput();

    List<Card> allCards = new ArrayList<>();
    List<Card> player1 = new ArrayList<>();
    List<Card> computer1 = new ArrayList<>();
    List<Card> computer2 = new ArrayList<>();
    List<Card> envelope = new ArrayList<>();
    Random rand = new Random();


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

    public List<Card> createEnvelope() {
        Card activePeopleCard = peopleCards.get(rand.nextInt(6));
        envelope.add(0, activePeopleCard);
        peopleCards.remove(activePeopleCard);
        Card activeWeaponCard = weaponCards.get(rand.nextInt(6));
        envelope.add(1, activeWeaponCard);
        weaponCards.remove(activeWeaponCard);
        Card activeLocationCard = locationCards.get(rand.nextInt(9));
        envelope.add(2, activeLocationCard);
        locationCards.remove(activeLocationCard);
        return envelope;
    }

    //create deck
    public DealManager() {          //adds all the cards from each list
        allCards.addAll(peopleCards);
        allCards.addAll(weaponCards);
        allCards.addAll(locationCards);
        allCards.remove(envelope);   //removes the cards that was picked from envelope method

        Collections.shuffle(allCards);   //then shuffles remainder
    }


    //dealHands
    public void dealHands() {
        int cardToPull;

        for (int i = 0; i < 6; i++) {
            cardToPull = rand.nextInt(allCards.size()); //randomly selecting card
            player1.add(allCards.get(cardToPull)); //add to player hand
            allCards.remove(cardToPull); //remove from the drawpile
        }
        for (int i = 0; i < 6; i++) {
            cardToPull = rand.nextInt(allCards.size());
            computer1.add(allCards.get(cardToPull));
            allCards.remove(cardToPull);
        }
        for (int i = 0; i < 6; i++) {
            cardToPull = rand.nextInt(allCards.size());
            computer2.add(allCards.get(cardToPull));
            allCards.remove(cardToPull);
        }
    }


    //reset deck
    public void clearDeck() {
        allCards.addAll(player1);
        allCards.addAll(computer1);
        allCards.addAll(computer2);
        allCards.addAll(envelope);
        player1.clear();
        computer1.clear();
        computer2.clear();
    }


    public List<Card> getPlayerHand(int player) {
        if (player == 1) {
            return player1;
        }
        if (player == 2) {
            return computer1;
        }
        if (player == 3) {
            return computer2;
        }
        return null;
    }

    public String checkEnvelopeMatch() {               //method to match accuse with envelope
        if ((userInput.getGuessPeopleCard().equals(envelope.get(0)) && (userInput.getGuessWeaponCard().equals(envelope.get(1))
                && (userInput.getGuessLocationCard().equals(envelope.get(2))))))
            return "Match found, You Win";
        else
            return "No Match Found, You Lose";
    }

    public Card checkNextHandMatch() {          //method to match suggestion with nextplayers cards
        List<Card> compareNextHandCards = new ArrayList<>();
        Random random = new Random();
        boolean matchFound;
        while (matchFound = false) {
            for (int i = 0; i < 6; i++) {
                if ((userInput.getGuessPeopleCard().equals(computer1.get(i)))) {
                    compareNextHandCards.add(computer1.get(i));
                }
                if ((userInput.getGuessWeaponCard().equals(computer1.get(i)))) {
                    compareNextHandCards.add(computer1.get(i));
                }
                if ((userInput.getGuessLocationCard().equals(computer1.get(i)))) {
                    compareNextHandCards.add(computer1.get(i));
                }
                if (compareNextHandCards.size() > 0) {
                    matchFound = true;
                }
                return compareNextHandCards.get(random.nextInt(3));
            }
            for (int i = 0; i < 6; i++) {
                if ((userInput.getGuessPeopleCard().equals(computer2.get(i)))) {
                    compareNextHandCards.add(computer2.get(i));
                }
                if ((userInput.getGuessWeaponCard().equals(computer2.get(i)))) {
                    compareNextHandCards.add(computer2.get(i));
                }
                if ((userInput.getGuessLocationCard().equals(computer2.get(i)))) {
                    compareNextHandCards.add(computer2.get(i));
                }
                if (compareNextHandCards.size() > 0) {
                    matchFound = true;
                }
                return compareNextHandCards.get(random.nextInt(3));
            }
        }
        return null;
    }
}
