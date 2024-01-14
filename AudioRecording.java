public class AudioRecording extends MultimediaItem implements Playable, AdjustableVolume {
    private int volume;

    public AudioRecording(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.println(title + "!");
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

    @Override
    public void run() {
        play();
    }
}

