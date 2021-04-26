package carvalho.murilo.pedra_papael_tesoura.models.classico;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Lagarto;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
