
@all
Feature: Go through top-menu on Onliner.by

  @correct
  Scenario: Go through "Автобарахолка" item
    Given open onliner.by
    When hover Автобарахолка
    Then category by_price is displayed
    Then category by_city is displayed
    Then category by_model is displayed


  @correct
  Scenario: Go through "Дома и квартиры" item
    Given open onliner.by
    When hover Дома и квартиры
    Then category by_location is displayed
    Then category by_rooms is displayed
    Then category by_apptPrice is displayed





