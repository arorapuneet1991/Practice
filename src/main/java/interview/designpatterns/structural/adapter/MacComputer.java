package interview.designpatterns.structural.adapter;

public class MacComputer {
    public boolean isMac(MacOS mac) {
        return mac.getOs().toLowerCase().contains("mac");

    }
}
