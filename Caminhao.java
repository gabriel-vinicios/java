import Veiculo.*;

public class Caminhao extends Veiculo {
    float Toneladas;
    int AlturaMax;
    int Comprimento;

    public float getToneladas() {
        return Toneladas;
    }

    public void setToneladas(float toneladas) {
        Toneladas = toneladas;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        AlturaMax = alturaMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int comprimento) {
        Comprimento = comprimento;
    }
}
