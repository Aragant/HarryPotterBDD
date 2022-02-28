Feature: The discount on Harry Potter's books
  Scenario: No book purchase
    Given Purchase book ""
    Then  The total price should be 0

  Scenario: Purchase 1 book
    Given Purchase book "1"
    Then The total price should be 8
    
  Scenario: Purchase 2 identical books
    Given Purchase book "1,1"
    Then  The total price should be 16
    
  Scenario: Purchase a 2 books collection with no more books
    Given Purchase book "1,2"
    Then The total price should be 15.2

  Scenario: Purchase a 3 books collection with no more books
    Given Purchase book "1,2,3"
    Then The total price should be 21.6

  Scenario: Purchase a 4 books collection with no more books
    Given Purchase book "1,2,3,4"
    Then The total price should be 25.6

  Scenario: Purchase a a 5 books collection with no more books
    Given Purchase book "1,2,3,4,5"
    Then The total price should be 30

  Scenario: Purchase a 2 books collection + 1 identical book
    Given Purchase book "1,1,2"
    Then The total price should be 23.2

  Scenario: Purchase a 3 books collection + a 2 books collection
    Given Purchase book "1,2,3,1,2"
    Then The total price should be 36.8
    
  Scenario: Purchase one collection of each + one identical book
    Given Purchase book "1,2,3,4,5,1,2,3,4,1,2,3,1,2,1"
    Then The total price should be 100.4

