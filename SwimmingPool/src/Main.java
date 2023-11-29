public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int volumeNow = 0;
        int time = 0;
        int timeSave = 0;


        if (fillingSpeed <= devastationSpeed) {
            System.out.println("Бассейн невозможно наполнить из-за большой утечки воды! ");

        } else {

            while (volumeNow < volume) {
                time = time + 1;
                volumeNow = volumeNow + fillingSpeed - devastationSpeed;

            }
        }

        System.out.println("До полного наполнения бассейна с утечкой необходимо: " + time + " минут.");
    }
}
