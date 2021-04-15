Feature:

  @GET_Request
  Scenario: As a user i should be able to do GET request
    * the client makes GET request
    * the client should receive an HTTP 200 response code
    * the client should receive an jsonPath Title equal to "Street Fight"
    * the client should receive an jsonPath Year equal to "2005"
    * the client should receive an jsonPath Released equal to "23 Apr 2005"
    * the client should receive an jsonPath Genre equal to "Documentary"







