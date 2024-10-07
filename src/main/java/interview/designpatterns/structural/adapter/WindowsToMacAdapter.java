package interview.designpatterns.structural.adapter;

public class WindowsToMacAdapter extends MacOS {
    WindowsOS windowsOS;

    public WindowsToMacAdapter(WindowsOS windowsOS) {
        this.windowsOS = windowsOS;
    }

    // adapts the non compatible value to compatible type
    public String getOs() {
        return this.windowsOS.getOs() + "orMac";
    }
}
