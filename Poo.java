public class Poo {
    public static void main(String[] args){
        Navegador navegador = new Navegador();
        Reprodutor reprodutor = new Reprodutor();
        Telefone telefone = new Telefone();

        IphoneOne iphoneOne = new IphoneOne();
        
        iphoneOne.aparelhoTelefonico = telefone;
        iphoneOne.navegadorInternet = navegador;
        iphoneOne.reprodutorMusical = reprodutor;

        iphoneOne.aparelhoTelefonico.atender();
        iphoneOne.aparelhoTelefonico.iniciarCorreioVoz();
        iphoneOne.aparelhoTelefonico.ligar();

        iphoneOne.navegadorInternet.adicionarNovaAba();
        iphoneOne.navegadorInternet.atualizarPagina();
        iphoneOne.navegadorInternet.exibirPagina();

        iphoneOne.reprodutorMusical.pausar();
        iphoneOne.reprodutorMusical.selecionarMusica();
        iphoneOne.reprodutorMusical.tocar();
    }
}
