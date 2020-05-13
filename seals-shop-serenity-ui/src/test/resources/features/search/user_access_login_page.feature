Feature: Search by keyword

  @cucumber
  Scenario: Searching for a term
    Given User accessed seals shop application
    When Click on login register or myacount link
    Then Enter Email address in login popup
    And Enter Password in login popup
    Then Click on login button
    When Click on login register or myacount link
    Then Click on Account information link

  #@gherkin
  #Scenario: Searching for a gherkin
    #Given Sergey is on the DuckDuckGo home page
    #When he searches for "cucumber"
    #Then all the result titles should contain the word "cucumber"
