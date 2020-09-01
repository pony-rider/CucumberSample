package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Steps {

    private String today;
    private String answer;

    @Given("today is {string}")
    public void setToday(String dayOfWeek) {
        this.today = dayOfWeek;
    }

    @When("I ask whether it's Friday yet")
    public void askIsItFriday() {
        answer = isFriday(today);
    }

    @Then("I should be told {string}")
    public void checkAnswer(String expectedAnswer) {
        assertEquals(expectedAnswer, answer);
    }

    static String isFriday(String dayOfWeek) {
        return "Friday".equals(dayOfWeek) ? "yes": "no";
    }
}
