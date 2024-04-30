package org.dio.aparelho.smartphone;

import org.dio.aparelho.funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import org.dio.aparelho.funcionalidades.navegador_internet.NavegadorInternet;
import org.dio.aparelho.funcionalidades.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar() {
        System.out.println("LIGANDO COM O IPHONE");
    }
    
    public void atender() {
        System.out.println("ATENDENDO COM O IPHONE");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ COM O IPHONE");
    }

    
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA COM O IPHONE");
    }

    
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA COM O IPHONE");
    }

    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA COM O IPHONE");
    }

    
    public void tocar() {
        System.out.println("TOCANDO MÚSICA COM O IPHONE");
    }

    
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA COM O IPHONE");
    }

    
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA COM O IPHONE");
    }
}
