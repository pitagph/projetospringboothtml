package com.example.aplicativoform.classe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.firebase.database.annotations.NotNull;

@Entity
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nome;
    @NotNull
    private String email;


    public cliente() {
    }
    
    public cliente(String nome, String email) {
        super();
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id: "+ id + "/n Nome: " + nome + " /n Email: " + email;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cliente other = (cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}


   
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
