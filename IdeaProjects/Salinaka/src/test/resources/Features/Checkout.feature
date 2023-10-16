Feature: user can able to checkout purchased item
  Scenario: user can able to checkout

    Given The user has logged in
    Then  Can select an item to see detail
    Then  Can select required size
    Then  Can add to shopping bag
    And user can able to view the bag
    Then  Can checkout the item
    Then Can view order summary
    Then can click Next step to enter shipping details
    Then Shipping details can be entered
    Then Can click Next step to view payment screen
    And user  can confirm the payment