package interview.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        MacComputer macComputer = new MacComputer();
        WindowsOS windowsOS=new WindowsOS();

        WindowsToMacAdapter windowsToMacAdapter = new WindowsToMacAdapter(windowsOS);

        MacOS macOS = new MacOS();

        System.out.println(macComputer.isMac(windowsToMacAdapter));
        System.out.println(macComputer.isMac(macOS));

        // tnis wont even work cz as of now they are not compatible
        //System.out.println(macComputer.isMac(windowsOS));
    }
}
