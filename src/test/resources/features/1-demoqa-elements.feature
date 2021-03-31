
Feature: DemoQA - Elements page
  Background:
    Given I am on the "Home" page
    And   I click "Elements"
    Then  I am on the "Elements" page


  Scenario: Text Box
    When I click "Text Box option"
    And  I set "Full Name field" to "Donald Biden"
    And  I set "Email field" to "example@testdevlab.com"
    And  I set "Current address field" to "Liljerum Grenadjärtorpet 24, Undrom, 880 10, Sweden"
    And  I set "Permanent address field" to "Djursbo 70, Landeryd, 310 82, Sweden"
    And  I click "Submit button"
    Then I see "Text Box results" with the following data:
      | Name         | Email                  | Current Address                                     | Permanent Address                    |
      | Donald Biden | example@testdevlab.com | Liljerum Grenadjärtorpet 24, Undrom, 880 10, Sweden | Djursbo 70, Landeryd, 310 82, Sweden |

  Scenario: Check Box
    When I click "Check Box option"
    And  I click "Expand button"
    And  I click "Commands"
    And  I click "Angular"
    And  I click "Classified"
    And  I click "Excel file"
    Then I see "selected results" with the following data:
      | Item       |
      | commands   |
      | angular    |
      | classified |
      | excelFile  |

  Scenario: Radio button
    When I click "Radio Button option"
    And  I click "Yes button"
    Then "Selected result" should contain "Yes"
    When I click "Impressive button"
    Then "Selected result" should contain "Impressive"
    And  "No button" should be "disabled"

  Scenario: Web Tables
    When I click "Web Tables option"
    And  I click "Add button"
    And  I set "First name field" to "Joe"
    And  I set "Last name field" to "Trump"
    And  I set "Email field" to "example@testdevlab.com"
    And  I set "Age field" to "53"
    And  I set "Salary field" to "10000"
    And  I set "Department field" to "Security"
    And  I click "Submit button"
    And  I set "Search field" to "example@testdevlab.com"
    Then I see "Table row" with the following data:
      | First name | Last name | Age | Email                  | Salary | Department |
      | Joe        | Trump     | 53  | example@testdevlab.com | 10000  | Security   |

  Scenario: Buttons
    When I click "Buttons option"
    And  I double click "Double click me button"
    Then "Double Click Message" should be "visible"
    When I right click "Right click me button"
    Then "Right click message" should be "visible"
    When I click "Click me button"
    Then "Dynamic click message" should be "visible"
  @run
    Scenario: Links
      When I click "Links option"
      And I click "Created link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 201 and status text Created"
      When I click "No Content link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 204 and status text No Content"
      When I click "Moved link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 301 and status text Moved Permanently"
      When I click "Bad Request link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 400 and status text Bad Request"
      When I click "Unauthorized link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 401 and status text Unauthorized"
      When I click "Forbidden link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 403 and status text Forbidden"
      When I click "Not Found link"
      Then "Response" should be "visible"
      And "Response" should contain "Link has responded with staus 404 and status text Not Found"
      When I click "Home link"
      Then I switch to new tab
      When I am on the "Home" page
      And   I click "Elements"
      And I click "Links option"
      And I click "Dynamic Home link"
      And I switch to new tab
      Then I am on the "Links" page


