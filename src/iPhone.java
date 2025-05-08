public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusicalImpl reprodutorMusical;
    private AparelhoTelefonicoImpl aparelhoTelefonico;
    private NavegadorInternetImpl navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    // Implementação de ReprodutorMusical
    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Implementação de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
