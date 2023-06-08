package com.devsuperior.apicamadas.service;

import com.devsuperior.apicamadas.dto.UserDTO;
import com.devsuperior.apicamadas.entity.User;
import com.devsuperior.apicamadas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired // injeta uma case xpto
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get(); // Requisacão/percistencia banco de dados
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
