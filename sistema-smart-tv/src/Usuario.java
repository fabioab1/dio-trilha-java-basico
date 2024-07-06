public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada) {
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        }

        smartTv.ligar();

        System.out.println("Novo estado da TV");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada) {
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        }

        smartTv.proximoCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo estado da TV");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada) {
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        }

        smartTv.trocarCanal(18);
        smartTv.diminuirVolume();

        System.out.println("Novo estado da TV");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada) {
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        }

        smartTv.desligar();

        System.out.println("Novo estado da TV");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada) {
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        }
    }
}
