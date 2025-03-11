# doc: https://automationintesting.online/message/swagger-ui/index.html
Feature: Message API

  Message API for the reception desk of a hotel.

  # url: https://automationintesting.online/message/
  Scenario: Get all messages
    Given I want to count all available messages
    When I count all the messages
    Then I receive the correct amount of messages
    # shouldn't status line be "HTTP/1.1 200 " ? check RFC
    # And the HTTP status line is "HTTP/1.1 200 "
    And the HTTP response status is 200
    # TODO And the message status is "read"

  # url: https://automationintesting.online/message/
  Scenario: Post a message
    Given I want to send a message to the reception
    And my email is a valid email
    # And my phone number is between 11 and 21 characters
    And my phone number is valid
    # And my message is between 20 and 2000 characters
    And my message is valid
    When I send the message
    Then the reception should have received the message
    And the HTTP response status is 201
