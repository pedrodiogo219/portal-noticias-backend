package com.example.portal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Noticia {
	private @Id @GeneratedValue Long id;
    private String titulo;
    private String descricao;

	@Column( length = 3000 )
    private String corpo;
    private String imagem;

    private Long idJornalista;
    
    public Noticia() {};
    
    public Noticia(String titulo, String descricao, String corpo, String imagem, Long idJornalista) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.corpo = corpo;
        this.imagem = imagem;
		this.idJornalista = idJornalista;
    };
    	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    	
  
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Long getIdJornalista() {
		return idJornalista;
	}
	public void setIdJornalista(Long idJornalista) {
		this.idJornalista = idJornalista;
	}

   @Override
    public String toString() {
        return "Noticia [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", corpo=" + corpo + ", imagem=" + imagem + " toString()=" + super.toString() + "]";
    }
    
    
}