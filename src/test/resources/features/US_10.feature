@us10
Feature:Kullanıcı Cantalar  kategorisinde  tüm ürünleri listeyebilmeli.

   Background:
   Given Kullanici kitapsec sitesine gider
   When kullanici CANTA butonuna tiklar

  @us10_tc01
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
  And Kullanici Okul Urunleri butonuna tiklar
  Then Kullanici tum urunleri listeler

  @us10_tc02
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
    And Kullanici Ilkokul Cantasi butonuna tiklar
    Then Kullanici tum urunleri listeler

  @us10_tc03
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
    And Kullanici Okul Cantasi butonuna tiklar
    Then Kullanici tum urunleri listeler

  @us10_tc04
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
    And Kullanici Beslenme Cantasi butonuna tiklar
    Then Kullanici tum urunleri listeler

  @us10_tc05
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
    And Kullanici Teknik Proje Cantasi butonuna tiklar
    Then Kullanici tum urunleri listeler




