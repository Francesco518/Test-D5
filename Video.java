public class Video extends MultimediaItem implements Playable, AdjustableVolume {
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration);
        this.volume = volume;
        this.brightness = brightness;
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.println(title + "!");
            }
            for (int k = 0; k < brightness; k++) {
                System.out.println(title + "*");
            }
        }
    }

    @Override
    public void lowerVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void raiseVolume() {
        volume++;
    }


    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        }
    }


    public void increaseBrightness() {
        brightness++;
    }

    @Override
    public void run() {
        play();
    }
}
