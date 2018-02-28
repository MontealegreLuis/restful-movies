package com.restful.movies.repositories;

import com.restful.movies.resources.Movie;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Movies Entity")
@RepositoryRestResource
public interface Movies extends JpaRepository<Movie, Long> {
}
