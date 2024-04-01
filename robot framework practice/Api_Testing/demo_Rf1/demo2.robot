*** Settings ***
Library    collections
Library  RequestsLibrary
*** Variables ***
${token} =    fa6d0e0853487e7
${url} =    https://restful-booker.herokuapp.com/auth
${urlc} =    https://restful-booker.herokuapp.com/booking/1
${urldel} =    https://restful-booker.herokuapp.com/booking/1
*** Keywords ***
# play with website
#     ${da}    Create Dictionary    name=sai  course=robot    
#     Log    ${da}
Auth Create token
    ${request}=    Create Dictionary    username=admin    password=password123
    ${response}=    POST    ${url}    json=${request}    expected_status=200
    Log    ${response.json()}
    Set Global Variable    ${token}
    Log    ${token}
Getting Booking Details
    ${request}=    Create Dictionary    token=${token}    firstname=Jim    lastname=Brown    totalprice=111    depositpaid=true
    ${response}=    GET    ${urlc}    json=${request}    expected_status=200
    Log    ${response.json()}
Updating Booking Details
    ${request}=    Create Dictionary    token=${token}
    ${response}=    DELETE    ${urldel}    json=${request}    expected_status=200
*** Test Cases ***
Executing demo
    # play with website
    Auth Create token
    Getting Booking Details
    Updating Booking Details