import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento:");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità:");
                    int luminositaImg = scanner.nextInt();
                    Immagine immagine = new Immagine(titolo, luminositaImg);
                    elementi[i] = immagine;

                    immagine.show();
                    scanner.close();
                    return;
                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    Audio audio = new Audio(titolo, durataAudio, volumeAudio);
                    elementi[i] = audio;

                    audio.play();
                    scanner.close();
                    return;
                case 3:
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    Video video = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    elementi[i] = video;

                    video.play();
                    scanner.close();
                    return;
            }
        }
    }
}