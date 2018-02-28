package com.restful.movies.resources;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@ApiModel(description = "Actor/Actress who is part of the cast of a movie")
@Entity
@Table(name = "artists")
@Getter @Setter @NoArgsConstructor
public class Artist {
    @Id @GeneratedValue
    private long id;
    private String name;
    private Gender gender;
    @ManyToMany(mappedBy = "cast")
    private List<Movie> movies;
}
