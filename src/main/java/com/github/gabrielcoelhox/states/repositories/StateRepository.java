package com.github.gabrielcoelhox.states.repositories;

import com.github.gabrielcoelhox.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
