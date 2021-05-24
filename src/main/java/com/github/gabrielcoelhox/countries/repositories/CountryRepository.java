package com.github.gabrielcoelhox.countries.repositories;

import com.github.gabrielcoelhox.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
