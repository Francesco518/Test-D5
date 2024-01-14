import java.util.Scanner;

public class MultimediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultimediaItem[] items = new MultimediaItem[5];

        // Read values for 5 multimedia items from the keyboard
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter title for item " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter duration for item " + (i + 1) + ": ");
            int duration = scanner.nextInt();

            // Consume newline after reading duration
            scanner.nextLine();

            System.out.println("Choose type for item " + (i + 1) + ":");
            System.out.println("1. AudioRecording");
            System.out.println("2. Video");
            System.out.println("3. Image");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter volume for AudioRecording: ");
                    int audioVolume = scanner.nextInt();
                    items[i] = new AudioRecording(title, duration, audioVolume);
                    break;
                case 2:
                    System.out.print("Enter volume for Video: ");
                    int videoVolume = scanner.nextInt();
                    System.out.print("Enter brightness for Video: ");
                    int videoBrightness = scanner.nextInt();
                    items[i] = new Video(title, duration, videoVolume, videoBrightness);
                    break;
                case 3:
                    System.out.print("Enter brightness for Image: ");
                    int imageBrightness = scanner.nextInt();
                    items[i] = new Image(title, imageBrightness);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Image.");
                    items[i] = new Image(title, 0);
                    break;
            }

            // Consume newline after reading the last input
            scanner.nextLine();
        }

        int choice;
        do {
            System.out.println("\nChoose an item to execute (1-5) or 0 to finish:");
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ". " + items[i].getTitle());
            }
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                items[choice - 1].run();
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 0);
    }
}
