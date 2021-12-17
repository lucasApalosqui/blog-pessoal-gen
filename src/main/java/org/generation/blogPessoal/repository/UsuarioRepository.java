package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long>{
	public Optional<usuario> findByUsuario(String usuario);
	
	public Optional<usuario> findByEmail(String email);

	public Optional<usuario> findByToken(String token);
}
