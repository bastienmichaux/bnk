# doc: https://automationintesting.online/message/swagger-ui/index.html
Feature: Message API

    Message API for the reception desk of a hotel.

    Background:
        # base URL: https://automationintesting.online/message/
        Given the API base url is set
        # auth API: https://automationintesting.online/auth/
        And I am authenticated


    # endpoint: GET /
    Scenario: Get all messages
        Given I want to get all messages
        When I get all messages
        Then I receive several messages
        And the response status code should be 200


    # endpoint: POST /
    Scenario: Post a message
        Given I want to post a message
        When I post a message
        Then I should read the message
        And the response status code should be 200


    # endpoint: GET /{id}
    Scenario: Get a message by ID
        Given I want to get a message
        And the message ID is {int}
        When I get the message
        Then I receive the message
        And the response status code should be 200

    # endpoint: PUT /{id}/read
    Scenario: Mark a message as read by ID
        Given I want to mark a message as read
        When I read a message
        And the message hasnt been read
        Then the message status should have changed
        And the response status code should be 200

    # endpoint: DELETE /{id}/
    Scenario: Delete a message
        Given I want to delete a message
        And the message ID is {int}
        When I delete the message
        Then I should not find the message
        And the response status code should be 200


    # endpoint: GET /count
    Scenario: Count the messages received
        Given I want to count the messages received
        When I count the messages
        And there is more than one message
        Then I should have several messages
