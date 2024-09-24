package SmartPhone.Iphone;


import SmartPhone.AparelhoTelefonico.aparelhoTelefonico;
import SmartPhone.NavegadorInternet.navegadorInternet;
import SmartPhone.reprodutorMusical.reprodutorMusical;

public class iphone implements reprodutorMusical, navegadorInternet, aparelhoTelefonico {
    @Override
    public void tocar() {
        System.out.println("Torcando música...");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
