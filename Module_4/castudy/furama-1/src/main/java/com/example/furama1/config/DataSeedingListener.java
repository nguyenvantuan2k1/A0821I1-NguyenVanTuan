package com.example.furama1.config;


import com.example.furama1.model.Role;
import com.example.furama1.repository.RoleRepository;
import com.example.furama1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataSeedingListener implements ApplicationListener<ContextClosedEvent> {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        if(roleRepository.findByName("ROLE_ADMIN") == null){
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_USER") == null){
            roleRepository.save(new Role("ROLE_USER"));
        }

        // chưa hiểu chỗ này
        if (roleRepository.findByName("ROLE_USER") == null){
            roleRepository.save(new Role("ROLE_BLOCK"));
        }
    }
}
