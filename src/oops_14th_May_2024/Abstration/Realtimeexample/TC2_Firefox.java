package oops_14th_May_2024.Abstration.Realtimeexample;

public class TC2_Firefox extends Baseclass {
    @Override
    String openBrowser() {
        printlog();
        System.out.println("open the firefox browser");
        return null;
    }

    @Override
    String closeBrowser() {
        printlog();
        System.out.println("close the fire fox browser");
        return null;
    }
}
