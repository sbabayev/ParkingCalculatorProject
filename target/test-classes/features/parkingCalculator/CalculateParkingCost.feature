Feature: As user, I want to be able to calculate parking cost


  @valet_parking
  Scenario:  Calculate parking cost with "Valet parking"
    Given u ser is on the ParkingCostCalculatorPage
    When user chose parking lot option as a "Valet Parking"
    And user enters entry date and time
    And user enters leaving date and time
    And user clicks on Calculate button
    Then user should be able to see valid result

  @parametrized_parking_option
  Scenario Outline: Calculate parking cost with parametrized <parkingOption>
    Given user is on the ParkingCostCalculatorPage
    When user chose parking lot option as a"<parkingOption>"
    And user enters entry date as "entryDate"
    And user enters entry time as "entryTime"
    And user clicks on "entryClock" entryClock
    And user enters leaving date as "leavingDate"
    And user enters leaving time as "leavingTime"
    And user clicks on "leavingClock" leavingClock
    Then user should be able to see valid cost result

    Examples:
      | parkingOption             |
      | Valet Parking             |
      | Short-Term Parking        |
      | Economy Parking           |
      | Long-Term Garage Parking  |
      | Long-Term Surface Parking |






#  Scenario:  Calculate parking cost with "Short-term Parking"
#
#  Scenario:  Calculate parking cost with "Economy Parking"
#
#  Scenario:  Calculate parking cost with "Long-Term Garage Parking"
#
#  Scenario:    Calculate parking cost with "Long-Term Surface parking"
#
#
#  Scenario: Verify page title
#      Given  user is on the ParkingCostCalculatorPage
#      Then title should be "PARKING COST CALCULATOR"
#
#  Scenario: Verify parking lot selection text
#    Given  user is on the ParkingCostCalculatorPage
#    Then parking lot selection text should be "Choose a Parking Lot "
#
#  Scenario: Verify entry input text
#    Given  user is on the ParkingCostCalculatorPage
#    Then entry input text should be "Please input entry date and time "
#
#  Scenario: Verify leaving input text
#    Given  user is on the ParkingCostCalculatorPage
#    Then leaving input text should be "Please input leaving date and time "
#
#  Scenario: Verify estimated cost text
#    Given  user is on the ParkingCostCalculatorPage
#    Then estimated cost text should be "estimated Parking costs"
#
#    @default
#  Scenario: Verify default value of estimated cost text
#    Given  user is on the ParkingCostCalculatorPage
#    Then default cost value should be "$ 0"
#
#
#      Scenario: Verify "Calculate" button is displayed
#
#      Scenario: Verify "Calculate" button is clickable
#
#
#        @boundary_check
#          Scenario:
#
#
#          // valid input date, valid leave date
#          // valid input date, invalid leave date
#          // valid input date, empty leave date
#          // invalid input date, valid leave date
#          // invalid input date, invalid leave date
#          // invalid input date, empty leave date
#
#          // empty input date, valid leave date
#          // empty input date, invalid leave date
#
#        // no action and click to calculate -> error
#        // input date is ahead of leaving date
#        // input time is ahead of leaving time
#        // AM and PM check
#
#          Critical functionalities:
#          Valid calculation expected with valid data
#          For example :
#                        For Valet Parking Option
#                        for 2 days it should show $18*2 = $36
#                                                                    OR
#                        for 2 hours it should show as $12 (as per requirement if only >5hrs -> charge more)
#          For example :
#                        For Short-Term (hourly) Parking
#                        for 1st hour -> $2
#
#
#
#          Checking validity of results using boundary value analysis
#          For example : For Valet Parking Option
#          4 hrs  -->  $12
#          5 hrs  -->  $12
#          6 hrs  -->  should be $18
#
#          23 hrs -->  $18
#          24 hrs -->  $18
#          25hrs  -->  should be $36
#
#
#
#
#
#
#
#  @default
#  Scenario:  Verify parking lot default option
#    Given user is on the ParkingCostCalculatorPage
#    Then parking lot default option should be "Valet Parking"
#
#  @default
#  Scenario:  Verify entry date default option
#    Given user is on the ParkingCostCalculatorPage
#    Then entry date default option should be "MM/DD/YYYY"
#
#  @default
#  Scenario:  Verify entry time default option
#    Given user is on the ParkingCostCalculatorPage
#    Then entry time default option should be "12:00"
#
#  @default
#  Scenario:  Verify "AM" selected as default entry input radio button option
#    Given user is on the ParkingCostCalculatorPage
#    Then entry input radio button 'AM' should be selected
#
#  @default @negative
#  Scenario:  Verify "PM" is NOT selected as default entry input radio button option
#    Given user is on the ParkingCostCalculatorPage
#    Then entry input radio button 'PM' should not be selected
#
#  @default
#  Scenario:  Verify "AM" selected as default leaving input radio button option
#    Given user is on the ParkingCostCalculatorPage
#    Then leaving input radio button 'AM' should be selected
#
#  @default @negative
#  Scenario:  Verify "PM" is NOT selected as default leaving radio button option
#    Given user is on the ParkingCostCalculatorPage
#    Then leaving input radio button 'PM' should not be selected











