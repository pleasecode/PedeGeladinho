package com.pleasecode.pedegeladinho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.pleasecode.pedegeladinho.model.Agente;
import com.pleasecode.pedegeladinho.model.AgenteUsuario;
import com.pleasecode.pedegeladinho.repository.AgenteRepository;
import com.pleasecode.pedegeladinho.repository.AgenteUsuarioRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	private AgenteUsuarioRepository agenteUsuarioRepository;
	
	@Autowired
	public CustomUserDetailsService(AgenteUsuarioRepository agenteUsuarioRepository) {
		// TODO Auto-generated constructor stub
		this.agenteUsuarioRepository = agenteUsuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AgenteUsuario agenteUsuario = Optional.ofNullable(agenteUsuarioRepository.findByUsername(username))
		.orElseThrow(() -> new UsernameNotFoundException("usuario não encontrado"));
		List<GrantedAuthority> authoriryListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
		List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
		return new User(agenteUsuario.getUsername(),
				agenteUsuario.getSenha(),
				agenteUsuario.isAdmin() ? authoriryListAdmin : authorityListUser);
		
	}

	
}
