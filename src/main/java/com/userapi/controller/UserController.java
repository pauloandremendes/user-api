package com.userapi.controller;

import com.userapi.model.dto.UserDTO;
import com.userapi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "CRUD do cadastro de produtos.")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/")
    @ApiOperation(value = "Obtem uma lista de todos os usuários cadastrados.")
    public List<UserDTO> getUsers() {
        List<UserDTO> usuarios = userService.getAll();
        return usuarios;
    }

    @GetMapping("/user/{id}")
    @ApiOperation(value = "Método responsável pela busca de usuário informando o ID.")
    UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    @ApiOperation(value = "Cadastro de novos usuários.")
    UserDTO newUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    @ApiOperation(value = "Busca de usuário pelo documento de CPF.")
    UserDTO findByCpf(@PathVariable String cpf) {
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    @ApiOperation(value = "Exclusão de usuário pelo ID.")
    UserDTO delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/user/search")
    @ApiOperation(value = "Busca por nomes baseado no valor informado.")
    public List<UserDTO> queryByName(
            @RequestParam(name="nome", required = true)
                    String nome) {
        return userService.queryByName(nome);
    }
}
