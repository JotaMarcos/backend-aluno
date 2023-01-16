package com.masterbare.aluno.model;

public class Aluno {
    
    //#region Atributos
    private Long id;

    private String nome;

    private Integer matricula;

    private String turma;

    private String disciplinas; 

    private Character frequencia;

    private Double primeiraNota;

    private Double segundaNota;

    private Double terceiraNota;

    private Double media;

    private Boolean situacao;

    private String observacao;
    //Sendregion

    //#region Getters and Setters 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Character getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Character frequencia) {
        this.frequencia = frequencia;
    }

    public Double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(Double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public Double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(Double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public Double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(Double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
      
    //Sendregion    

}
