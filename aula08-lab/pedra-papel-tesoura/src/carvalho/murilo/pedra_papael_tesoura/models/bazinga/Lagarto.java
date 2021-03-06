package carvalho.murilo.pedra_papael_tesoura.models.bazinga;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Papel;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Pedra;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
