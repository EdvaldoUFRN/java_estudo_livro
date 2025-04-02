
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //variáveis para armazenar os três palpites feitos pelos jogadores.
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        //declara três variáveis para armazenar um valor verdadeiro ou falso com base na resposta dos jogadores.
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //cria um número alvo que os jogadores tem que acertar.
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            //chamaremos o método guess de cada jogador.
            p1.guess();
            p2.guess();
            p3.guess();
            //recebe o palpite de cada jogador ( o resultado da execução do método guess() acessando a variável do palpite de cada jogador.)
            guessp1 = p1.number;
            System.out.println("PLayer one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("PLayer two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("PLayer three guessed " + guessp3);
            //Verifica o palpite de cada jogador para ver se corresponde ao alvo.
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right ? " + p1isRight);
                System.out.println("Player two got it right ? " + p2isRight);
                System.out.println("Player three got it right ? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                //temos que continuar porque ninguém acertou!
                System.out.println("Players will have to try again.");

            }//Fim das instruções if else
        }//fim do loop
    }//fim do método
}//fim da classe.
