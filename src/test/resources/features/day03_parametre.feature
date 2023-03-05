@parametre
Feature: arama_feature
  Background: googlea_git
    Given kullanici google gider
@smoke
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" için arama yapar
    Then sonuclarin "iphone" icerdigini dogrula
    Then close the application

@smoke
  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarin "tesla" icerdigini dogrula
    Then close the application
@smoke
  Scenario: TC03_google_water_arama
    When kullanici "water" için arama yapar
    Then sonuclarin "water" icerdigini dogrula
    Then close the application


  Scenario: TC01_google_tea-pot_arama
    When kullanici "tea-pot" için arama yapar
    Then sonuclarin "tea-pot" icerdigini dogrula
    Then close the application

#      "veri"  -> feature file i parametrize etmek icin kullanilir
#
