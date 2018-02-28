package com.restful.movies.repositories;


import com.restful.movies.resources.Artist;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Artist Entity")
@RepositoryRestResource
public interface Artists extends JpaRepository<Artist, Long> {
}
