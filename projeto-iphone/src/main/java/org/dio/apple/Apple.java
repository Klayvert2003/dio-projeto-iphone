package org.dio.apple;

import org.dio.aparelho.funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import org.dio.aparelho.funcionalidades.aparelho_telefonico.AparelhoTelefonicoImpl;
import org.dio.aparelho.funcionalidades.navegador_internet.NavegadorInternet;
import org.dio.aparelho.funcionalidades.navegador_internet.NavegadorInternetImpl;
import org.dio.aparelho.funcionalidades.reprodutor_musical.ReprodutorMusical;
import org.dio.aparelho.funcionalidades.reprodutor_musical.ReprodutorMusicalImpl;
import org.dio.aparelho.smartphone.Iphone;

public class Apple {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonicoImpl aparelhoTelefonicoImpl = new AparelhoTelefonicoImpl();
        NavegadorInternetImpl navegadorInternetImpl = new NavegadorInternetImpl();
        ReprodutorMusicalImpl reprodutorMusicalImpl = new ReprodutorMusicalImpl();

        AparelhoTelefonico aparelhoTelefonico1 = aparelhoTelefonicoImpl;
        aparelhoTelefonico1.iniciarCorreioVoz();
        aparelhoTelefonico1.ligar();
        aparelhoTelefonico1.atender();

        NavegadorInternet navegadorInternet1 = navegadorInternetImpl;
        navegadorInternet1.adicionarNovaAba();
        navegadorInternet1.exibirPagina();
        navegadorInternet1.atualizarPagina();

        ReprodutorMusical reprodutorMusical1 = reprodutorMusicalImpl;
        reprodutorMusical1.tocar();
        reprodutorMusical1.selecionarMusica();
        reprodutorMusical1.pausar();

        AparelhoTelefonico aparelhoTelefonico2 = iphone;
        aparelhoTelefonico2.iniciarCorreioVoz();
        aparelhoTelefonico2.atender();
        aparelhoTelefonico2.ligar();

        NavegadorInternet navegadorInternet2 = iphone;
        navegadorInternet2.adicionarNovaAba();
        navegadorInternet2.atualizarPagina();
        navegadorInternet2.exibirPagina();

        ReprodutorMusical reprodutorMusical2 = iphone;
        reprodutorMusical2.tocar();
        reprodutorMusical2.pausar();
        reprodutorMusical2.selecionarMusica();
    }
}
