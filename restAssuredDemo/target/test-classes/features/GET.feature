Feature:
  Verify different GET operation using REST-Assured

  Scenario: Verify one film character of the post
    Given Perform GET operation for "/posts"
    And Perform Get for the post number "1"
    Then Should see the character name as "Anakin Skywalker"

