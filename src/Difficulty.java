public class Difficulty {
    private int easy;
    private int medium;
    private int hard;
    private int guessCount;

    public Difficulty() {
    }

    public Difficulty(int easyDif, int mediumDif, int hardDif, int guessCount) {
        this.easy = easyDif;
        this.medium = mediumDif;
        this.hard = hardDif;
        this.guessCount = guessCount;
    }

    public int getEasy() {
        this.guessCount = 15;

        return guessCount;
    }

    public int setEasy(int easy) {
        this.easy = easy;
        return easy;
    }

    public int getMedium() {
        this.guessCount = 10;

        return guessCount;
    }

    public int setMedium(int medium) {
        this.medium = medium;
        return medium;
    }

    public int getHard() {
        this.guessCount = 5;

        return guessCount;
    }

    public int setHard(int hard) {
        this.hard = hard;
        return hard;
    }
}
