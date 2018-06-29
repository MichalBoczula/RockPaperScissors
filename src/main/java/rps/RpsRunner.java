package rps;

public final class RpsRunner {

    public static void main(String[] args){
        final RpsControl rpsControl = new RpsControl();
        final RpsInput rpsInput = new RpsInput();

        rpsControl.menu(rpsInput);
    }
}
