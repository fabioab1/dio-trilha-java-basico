public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void trocarCanal(int numeroCanal) {
        if(ligada && numeroCanal > 0 && numeroCanal < 33) {
            canal = numeroCanal;
            System.out.println("Mudando para o canal " + numeroCanal + "...");
        }
    }

    public void proximoCanal() {
        if(ligada && canal < 32) {
            canal++;
            System.out.println("Mudando para o próximo canal...");
        }
    }
    
    public void canalAnterior() {
        if(ligada && canal > 1) {
            canal--;
            System.out.println("Mudando para o canal anterior...");
        }
    }

    public void aumentarVolume() {
        if(ligada && volume <= 100) {
            volume++;
            System.out.println("Aumentando o volume...");
        }
    }

    public void diminuirVolume() {
        if(ligada && volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume...");
        }
    }
}
