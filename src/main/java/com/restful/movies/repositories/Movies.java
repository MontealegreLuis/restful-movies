package com.restful.movies.repositories;

import com.restful.movies.resources.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Movies extends JpaRepository<Movie, Long> {
}
