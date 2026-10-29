package com.example.WebShop.services;


import com.example.WebShop.models.Client;
import com.example.WebShop.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements UserDetailsService {
    @Autowired
    private ClientRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{

        Client client = repo.findByEmail(email);
        if(client != null){
            var springUser = User.withUsername(client.getEmail())
                    .password(client.getPassword())
                    .build();
            return springUser;
        }
        return null;
    }
}
