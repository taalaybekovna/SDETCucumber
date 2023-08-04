Feature: Google search

  @googleSearch
  Scenario Outline: Google search for capital cities of countries
    Given user is on google home page
    When  user searches for "<country>" capitals
    Then user should see "<capital>" result

    Examples:
      | country              | capital          |
      | USA                  | Washington, D.C. |
      | Kyrgyzstan           | Bishkek          |
      | England              | London           |
      | United Arab Emirates | Abu Dhabi        |
      | Russia               | Moscow           |
      | Korea                | Seoul            |
      | Japan                | Tokyo            |

  #ctrl+alt+L ------> to organize the pipelines


