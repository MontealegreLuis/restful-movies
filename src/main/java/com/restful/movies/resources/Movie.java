package com.restful.movies.resources;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
@Getter @Setter @NoArgsConstructor
public class Movie {
    @Id @GeneratedValue
    private long id;
    private String description;
}
