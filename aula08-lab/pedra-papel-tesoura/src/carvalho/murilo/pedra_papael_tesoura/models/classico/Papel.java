package carvalho.murilo.pedra_papael_tesoura.models.classico;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;

public class Papel extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
