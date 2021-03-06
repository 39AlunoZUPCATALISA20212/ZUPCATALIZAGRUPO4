package br.com.zup.Projeto.JWT;

import br.com.zup.Projeto.user.Usuario;
import br.com.zup.Projeto.user.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioLoginService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(username);

        usuarioOptional.orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));

        Usuario usuario = usuarioOptional.get();
        return new UsuarioLogin(usuario.getId(), usuario.getEmail(), usuario.getSenha());
    }
}
