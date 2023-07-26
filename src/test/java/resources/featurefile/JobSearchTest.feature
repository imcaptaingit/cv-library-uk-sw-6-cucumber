@regression
Feature: Job search Test
  As a user I want to search a job into Uk library website

  @smoke
  Scenario Outline: Verify job search result using different dataSet
    Given I am on Homepage
    When I enter the job title "<job title>"
    And I enter the location "<location>"
    And I select the distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter the minimum salary "<salaryMin>"
    And I enter the maximum salary "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on find jobs button
    Then I verify the result "<result>"

    Examples:
      | job title          | location                           | distance | salaryMin | salaryMax | salaryType | jobType   | result                                         |
      | Tester             | Harrow on the Hill, Greater London | 5        | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill    |
      | Software           | Pitsea, Essex                      | 15       | 40000     | 500000    | Per month  | Permanent | Permanent Software jobs in Pitsea              |
      | Manager            | Ilford, Greater London             | 2        | 3000      | 4000      | Per week   | Permanent | Permanent Manager jobs in Ilford               |
      | Bookkeeper         | Bishops Hatfield, Hertfordshire    | 10       | 80000     | 500000    | Per month  | Permanent | Permanent Bookkeeper jobs in Hatfield          |
      | Sales Manager      | Lincoln, Lincolnshire              | 15       | 300       | 400       | Per day    | Permanent | Permanent Sales Manager jobs in Lincoln        |
      | Software Developer | Kingswood, South Gloucestershire   | 100      | 4000      | 5000      | Per day    | Permanent | Permanent Software Developer jobs in Kingswood |