public class Main {
    public static void main (String args[]){

        Chrome chrome = new Chrome();
        chrome.getBrowserVersion();

        Firefox firefox = new Firefox();
        firefox.getBrowserVersion();

    }
}

abstract class Browser{

    abstract String getBrowserVersion();
}

class Chrome extends Browser{

    @Override
    String getBrowserVersion(){
        return "10.5";
    }
}

class Firefox extends Browser{

    @Override
    String getBrowserVersion(){
        return "11.7";
    }

}