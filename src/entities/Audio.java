package entities;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "" + "!".repeat(volume));
        }
    }
}

