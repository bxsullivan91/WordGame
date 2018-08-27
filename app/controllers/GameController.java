package controllers;

import models.Words;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class GameController extends Controller
{
    private FormFactory formFactory;

    @Inject
    public GameController(FormFactory formFactory)
    {
        this.formFactory = formFactory;
    }
    public Result getStart()
    {
        return ok(views.html.start.render());
    }

    public Result getFirstStory()
    {
        Words words = new Words();
        words.setPlace1("Parking Lot");
        words.setAdjective1("fuzzy");
        words.setNoun1("frog");
        words.setNoun2("zombie pit");
        words.setPastTenseVerb1("loved");
        words.setPlace2("the void");

        return ok(views.html.story.render(words));
    }

    public Result getSecondStory()
    {
        Words words = new Words();
        words.setPlace1("House of Mirrors");
        words.setAdjective1("insane");
        words.setNoun1("erector set");
        words.setNoun2("Marvel Cinematic Universe");
        words.setPastTenseVerb1("shot");
        words.setPlace2("the Matrix");

        return ok(views.html.story.render(words));

    }

    public Result getThirdStory()
    {
        Words words = new Words();
        words.setPlace1("National Archives");
        words.setAdjective1("boring");
        words.setNoun1("mosquito");
        words.setNoun2("van");
        words.setPastTenseVerb1("tripped");
        words.setPlace2("dentist");

        return ok(views.html.story.render(words));
    }

    public Result getRandomStory()
    {
        Words words = new Words();

        words.setPlace1(words.getRandomPlace());
        words.setAdjective1(words.getRandomAdjective());
        words.setNoun1(words.getRandomNoun());
        words.setNoun2(words.getRandomNoun());
        words.setPastTenseVerb1(words.getRandomVerbPT());
        words.setPlace2(words.getRandomPlace());

        return ok(views.html.story.render(words));
    }

    public Result getMyOwnStory()
    {
        return ok(views.html.selectwords.render());
    }

    public Result postMyOwnStory()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        Words words = new Words();

        String place1 = form.get("place1");
        String adjective1 = form.get("adjective1");
        String noun1 = form.get("noun1");
        String noun2 = form.get("noun2");
        String verb1 = form.get("verb1");
        String place2 = form.get("place2");

        words.setPlace1(place1);
        words.setAdjective1(adjective1);
        words.setNoun1(noun1);
        words.setNoun2(noun2);
        words.setPastTenseVerb1(verb1);
        words.setPlace2(place2);

        return ok(views.html.story.render(words));
    }

}
