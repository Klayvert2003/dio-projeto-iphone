package org.dio.aparelho.funcionalidades.aparelho_telefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("APARELHO LIGANDO");
    }

    public void atender() {
        System.out.println("APARELHO ATENDENDO");
    }


    public void iniciarCorreioVoz() {
        System.out.println("APARELHO INICIANDO CORREIO DE VOZ");
    }
}
