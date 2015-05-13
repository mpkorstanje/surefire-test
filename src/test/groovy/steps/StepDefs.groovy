package steps

import static cucumber.api.groovy.EN.Then
import static cucumber.api.groovy.EN.When

When(~/^I run this test$/) { ->
    System.out.println("Test2 Output!")
}

Then(~/^surefire should do the right thing$/) { ->
}
