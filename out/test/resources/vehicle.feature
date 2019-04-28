Feature: Vehicle Registration

  #Valid test
  Scenario:Valid Registration
    Given the user is on vehicle registartion website
    When user enters valid registartion
    Then details of insurance are displayed

    #negative scenario, message is displayed informing user that vehicle doesn't exists, wording of message can be defined based on requirement
  Scenario:Blank Registration
    Given the user is on vehicle registartion website
    When user enters invalid registartion
    Then "Sorry record not found" message is displayed


    #negative scenario
  Scenario:Invalid Registration
    Given the user is on vehicle registartion website
    When user leaves registartion blank
    Then message to enter details is displayed

