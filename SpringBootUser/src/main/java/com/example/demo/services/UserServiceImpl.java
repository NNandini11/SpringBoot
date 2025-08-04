package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository urepo;
	

	@Override
	public User addUser(User u) {
		
		return  urepo.save(u);
	}

	@Override
	public User getUser(Long id) {
		return urepo.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return urepo.findAll();
	}

	@Override
	public User updateUser(Long id, User u) {
	    User existedUser = urepo.findById(id)
	        .orElseThrow(() -> new RuntimeException("User with that id Not Present! " + id));

	    existedUser.setName(u.getName());
	    existedUser.setEmail(u.getEmail());

	    return urepo.save(existedUser);
	}


	@Override
	public String deleteUser(Long id) {
	    urepo.deleteById(id); 
	    return "User with ID " + id + " has been deleted successfully!";
	}

}
