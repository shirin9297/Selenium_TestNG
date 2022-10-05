package tests.day22;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {
        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //-login butonuna bas
        //-test data user email: customer@bluerentalcars.com ,
        // -test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
