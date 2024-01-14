public class Image extends MultimediaItem {
    private int brightness;

    public Image(String title, int brightness) {
        super(title, 0); // Image has no duration
        this.brightness = brightness;
    }


    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        }
    }


    public void increaseBrightness() {
        brightness++;
    }

    public void show() {
        for (int i = 0; i < brightness; i++) {
            System.out.println(title + "*");
        }
    }


    public void run() {
        show();
    }
}

