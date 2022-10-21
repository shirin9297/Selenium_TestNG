package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onStart(ITestContext arg){
        System.out.println("onStart - Tum testlerden ONCE 1 sefer cagrilir => "+arg.getName());
    }

    @Override
   public void onFinish(ITestContext arg){
        System.out.println("onFinish - Tum testlerden SONRA 1 sefer cagrilir => "+arg.getName());

    }

    @Override
    public void onTestStart(ITestResult result){
       // Before Method a benzer
        System.out.println("onTestStart - Method sayisi kadar, Her bir @Test annotation dan once 1 kez calisir => "+result.getName());
    }


}
