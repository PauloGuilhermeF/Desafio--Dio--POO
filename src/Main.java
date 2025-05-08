public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando funcionalidades do reprodutor musical
        iphone.selecionarMusica("Despacito");
        iphone.tocar();
        iphone.pausar();

        // Testando funcionalidades do telefone
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades do navegador
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
