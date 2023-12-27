@us11
Feature:Kullanıci bana ozel butonundan uye paneli sayfasini goruntuleyebilmeli.

  @us11_tc01
  Scenario:Kullanici tum Okul Urunlerini listeleyebilmeli
    Given Kullanici kitapsec sitesine gider
    When Kullanici uye girisi butonuna tiklar gerekli bilgileri girip siteye giris yapar.
    When Kullanici Bana Ozel butonuna basar
    Then Kullanici Uye Panelini  goruntuler
