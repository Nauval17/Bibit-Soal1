@Web
Feature:
    Background:
    Given User open website "https://stockbit.com/"
    When User is at homepage
    Then User see all menu available on the homepage

    @Login_1
    Scenario Outline: Positive Case Login
        Given User is at homepage
        When User click login menu button
        Then User is on login page
        When User input username or email "<username>"
        And User input password "<password>"
        And User click login button
        Then User successfully login
        Examples:
            | username                  |  | password      |
            | nauvalshafiq              |  | @elinsUGM2015 |
            | nauval.shafiq17@gmail.com |  | @elinsUGM2015 |