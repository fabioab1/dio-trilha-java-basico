public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrou no método main.");
        a();
        System.out.println("Finalizou o método main.");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i < 5; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    public static void c() {
        System.out.println("Entrou no método c.");
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
