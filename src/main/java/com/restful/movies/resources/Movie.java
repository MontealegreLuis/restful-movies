package com.restful.movies.resources;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@ApiModel(description = "Details about a movie")
@Entity
@Table(name = "movies")
@Getter @Setter @NoArgsConstructor
public class Movie {
    @Id @GeneratedValue
    private long id;

    private String title;

    @ApiModelProperty(notes = "A short summary of the movie")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Artist> cast;
}
