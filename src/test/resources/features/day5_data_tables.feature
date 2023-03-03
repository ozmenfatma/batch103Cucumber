@data_tables
Feature:data_tables
  Scenario: TC01_musteri_giris_testi

 #| | ->data table sayesinde istediğimiz datayı özel olarak da seçebiliyoruz ama scenario outline da olan dataları seçme imkanımız olmuyor sırayla hepsi giriliyor
    Given kullanici "https://www.bluerentalcars.com/login" gider
     #| | -> datatable olusturmak icin kullanilir. DATATABES SCENARIO OUTLINE ILE DE KULLANILABILIR
    When kullanici emaili ve sifresini girer
      | email                         | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |

    Then close the application






