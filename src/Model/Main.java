package Model;

public class Main {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Pretty Boy", "França",31, 1.75f, 68.9f, 11, 3, 1);
        L[1] = new Lutador("Putscript", "Brasil",29, 1.68f, 57.8f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA",35, 1.65f, 80.9f, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Austrália",28, 1.93f, 81.6f, 13, 0, 2);
        L[4] = new Lutador("Lucas", "Zimbabue",18, 1.50f, 90.9f, 5, 1, 6);
        L[5] = new Lutador("Kelvis Duran", "Etiópia",34, 1.89f, 90.9f, 10, 3, 1);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[4], L[5]);
        UEC01.lutar();
        L[4].status();
        L[5].status();
    }
}
