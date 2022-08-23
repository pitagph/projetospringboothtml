package com.example.aplicativoform.service;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aplicativoform.classe.cliente;
import com.google.common.base.Optional;

@Repository
public interface repositorycliente {
    

    Optional<cliente> findByNomeContaining(String Nome);
	Optional<cliente> findByNome(String Nome);


}
