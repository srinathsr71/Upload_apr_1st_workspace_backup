*** Settings ***
Library    Collections
Library    RequestsLibrary

*** Variables ***
${listu} =    https://reqres.in/api/users?page=2
${createu} =    https://reqres.in/api/users
${updateu} =    https://reqres.in/api/users/2
${deleteu} =    https://reqres.in/api/users/2
*** Keywords ***
# List users
#     ${response}=    GET    ${listu}    expected_status=200
#     Log    ${response.json()}
# Create User
#     ${request}=    Create Dictionary    name=morpheus    job=leader
#     ${response}=    POST    ${createu}    json=${request}    expected_status=201
#     Log    ${response.json()}

# Update User
#     ${request}=    Create Dictionary    name=srinath    job=tester
#     ${response}=    PATCH    ${updateu}    json=${request}    expected_status=200
#     Log    ${response.json()}
Delete User
    # ${request}=    Create Dictionary    name=srinath    job=tester
    ${response}=    DELETE    ${deleteu}    expected_status=204
    
*** Test Cases ***
Executing tests
    # List users
    # Create User
    # Update User
    Delete User        
