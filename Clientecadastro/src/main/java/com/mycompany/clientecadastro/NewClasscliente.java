/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientecadastro;

/**
 *
 * @author roy63042026
 */
public class NewClasscliente {
        

  
    private String codigo;
    private String nome;
    private String contato;
    private String ativo;

    private String cpf;
    private String identidade;
    private String dataNascimento;
    private String cnpj;
    private String inscricaoEstadual;

    // Endereço
    private String endereco;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;

    private int codigoCidade;
    private String cidade;

    private String sexo;

    // Contatos
    private String telefone;
    private String fax;
    private String celular;
    private String email;

    // Outras informações
    private int codigoAtividade;
    private String atividade;
    private String observacao;

    // Login
    private String emailLogin;
    private String usuario;
    private String senha;
    private String confirmarSenha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(int codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(int codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public NewClasscliente() {
        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
        this.ativo = ativo;
        this.cpf = cpf;
        this.identidade = identidade;
        this.dataNascimento = dataNascimento;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.codigoCidade = codigoCidade;
        this.cidade = cidade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.fax = fax;
        this.celular = celular;
        this.email = email;
        this.codigoAtividade = codigoAtividade;
        this.atividade = atividade;
        this.observacao = observacao;
        this.emailLogin = emailLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    public NewClasscliente(String codigo, String nome, String contato, String ativo, String cpf, String identidade, String dataNascimento, String cnpj, String inscricaoEstadual, String endereco, String numero, String complemento, String cep, String bairro, int codigoCidade, String cidade, String sexo, String telefone, String fax, String celular, String email, int codigoAtividade, String atividade, String observacao, String emailLogin, String usuario, String senha, String confirmarSenha) {
        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
        this.ativo = ativo;
        this.cpf = cpf;
        this.identidade = identidade;
        this.dataNascimento = dataNascimento;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.codigoCidade = codigoCidade;
        this.cidade = cidade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.fax = fax;
        this.celular = celular;
        this.email = email;
        this.codigoAtividade = codigoAtividade;
        this.atividade = atividade;
        this.observacao = observacao;
        this.emailLogin = emailLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    
    
    
    
    
    
}