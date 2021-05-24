package com.github.gabrielcoelhox.states.resources;

import com.github.gabrielcoelhox.states.entities.State;
import com.github.gabrielcoelhox.states.repositories.StateRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<State> states() {
    return repository.findAll();
  }
}
