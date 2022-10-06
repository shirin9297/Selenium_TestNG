package tests.practice09;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class SearchProductTest {
    // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Ürünler' butonuna tıklayın
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın


    @Test
    public void searchProductPage() {
        // 1. Tarayıcıyı başlat
       // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("https://automationexercise.com/");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),homeUrl);
// 4. 'Ürünler' butonuna tıklayın

    }
}
