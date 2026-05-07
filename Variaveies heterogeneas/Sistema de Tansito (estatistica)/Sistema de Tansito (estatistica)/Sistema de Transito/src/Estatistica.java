class Estatistica {
    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    Estatistica() {
        this(0, "", 0);
    }
    Estatistica(int CodigoCidadeestatistica,
    String NomeCidadeestatistica,
    int QtdAcidentesestatistica){
       CodigoCidade = CodigoCidadeestatistica;
       NomeCidade = NomeCidadeestatistica;
       QtdAcidentes = QtdAcidentesestatistica;
    }
}
