package com.heranca.app;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
  
        usuario.nome = "Rafael";
        usuario.cpf = "00000000000";
        usuario.email = "rafis@gmail.com";
        usuario.telefone = "4002-8922";
        usuario.idade = 16;

        empresa.razaoSocial = "rafael LTDA";
        empresa.nomeFantasia = "cyberdyne systems";
        empresa.cnpj = "55.076.551/0001-20";
        empresa.email = "empresarafael@gmail.com";
        empresa.telefone = "4002-8922";
        
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF de " + usuario.nome + ": " + usuario.cpf);
        System.out.println("E-mail de "+ usuario.nome + ": " + usuario.email);
        System.out.println("Telefone de " + usuario.nome + ": " + usuario.telefone);
        System.out.println("Idade de " + usuario.nome + ": " + usuario.idade + " anos.");
        System.out.println("\n-------------------\n");
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);
    }
}
