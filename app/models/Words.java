package models;

import java.util.ArrayList;
import java.util.Random;

public class Words
{
    private String place1;
    private String adjective1;
    private String noun1;
    private String noun2;
    private String pastTenseVerb1;
    private String place2;


    public String getPlace1()
    {
        return place1;
    }

    public void setPlace1(String place1)
    {
        this.place1 = place1;
    }

    public String getAdjective1()
    {
        return adjective1;
    }

    public void setAdjective1(String adjective1)
    {
        this.adjective1 = adjective1;
    }

    public String getNoun1()
    {
        return noun1;
    }

    public void setNoun1(String noun1)
    {
        this.noun1 = noun1;
    }

    public String getNoun2()
    {
        return noun2;
    }

    public void setNoun2(String noun2)
    {
        this.noun2 = noun2;
    }

    public String getPastTenseVerb1()
    {
        return pastTenseVerb1;
    }

    public void setPastTenseVerb1(String pastTenseVerb1)
    {
        this.pastTenseVerb1 = pastTenseVerb1;
    }

    public String getPlace2()
    {
        return place2;
    }

    public void setPlace2(String place2)
    {
        this.place2 = place2;
    }

    public String getRandomNoun()
    {
        Random random = new Random();

        ArrayList<String> nouns = new ArrayList<>();
        nouns.add("percentage");
        nouns.add("delivery van");
        nouns.add("chapter");
        nouns.add("priority queue");
        nouns.add("technology");
        nouns.add("insurance card");
        nouns.add("Bite Squad Driver");

        int randomNounIndex = random.nextInt(nouns.size());

        String randomNoun = nouns.get(randomNounIndex);

        return randomNoun;

    }

    public String getRandomAdjective()
    {
        Random random = new Random();

        ArrayList<String> adjectives = new ArrayList<>();
        adjectives.add("serious");
        adjectives.add("pleasant");
        adjectives.add("significant");
        adjectives.add("willing");
        adjectives.add("emotional");
        adjectives.add("conscious");
        adjectives.add("unlikely");

        int randomIndex = random.nextInt(adjectives.size());

        String randomAdjective = adjectives.get(randomIndex);

        return randomAdjective;
    }

    public String getRandomPlace()
    {
        Random random = new Random();

        ArrayList<String> places = new ArrayList<>();
        places.add("Fords of Isen");
        places.add("Hobbiton");
        places.add("Iceland");
        places.add("Pawnee, Indiana");
        places.add("that place in Office Space");
        places.add("actual space");
        places.add("Neverland");

        int randomIndex = random.nextInt(places.size());

        String randomPlace = places.get(randomIndex);

        return randomPlace;
    }

    public String getRandomVerbPT()
    {
        Random random = new Random();

        ArrayList<String> verbsPT = new ArrayList<>();
        verbsPT.add("rode");
        verbsPT.add("punished");
        verbsPT.add("sunk");
        verbsPT.add("prompted");
        verbsPT.add("transferred");
        verbsPT.add("praised");
        verbsPT.add("scratched");

        int randomIndex = random.nextInt(verbsPT.size());

        String randomVerbPT = verbsPT.get(randomIndex);

        return randomVerbPT;
    }


}

