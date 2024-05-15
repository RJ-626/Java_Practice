package oops_14th_May_2024.Abstration.Realtimeexample;

public class TC1_Chrome extends Baseclass {
    @Override
    String openBrowser() {
        printlog();
        System.out.println("open the chrome browser");
        return null;
    }

    @Override
    String closeBrowser() {
        printlog();
        System.out.println("close the chrome browser");
        return null;
    }
}
