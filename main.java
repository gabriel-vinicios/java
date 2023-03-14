class main {
    public static void main(String[] args) {
        CarroPasseio carroPasseio = new CarroPasseio();
        Caminhao caminhao = new Caminhao();

        caminhao.setAlturaMax(72);
        caminhao.setComprimento(32);
        caminhao.setVelocMax(52);
        caminhao.setPeso(52);
        caminhao.setPreco(180000);
        caminhao.setToneladas(12);

        carroPasseio.setCor("marrom");
        carroPasseio.setModelo("Audi");
        carroPasseio.setPeso(10);
        carroPasseio.setPreco(1800);
        carroPasseio.setVelocMax(32);

        System.out.println(caminhao);
        System.out.println(caminhao.getAlturaMax());
        System.out.println(caminhao.getComprimento());
        System.out.println(caminhao.getVelocMax());
        System.out.println(caminhao.getPeso());
        System.out.println(caminhao.getPreco());
        System.out.println(caminhao.getToneladas());
        System.out.println(carroPasseio);
        System.out.println(carroPasseio.getCor());
        System.out.println(carroPasseio.getModelo());
        System.out.println(carroPasseio.getPeso());
        System.out.println(carroPasseio.getPreco());
        System.out.println(carroPasseio.getVelocMax());
    }
}