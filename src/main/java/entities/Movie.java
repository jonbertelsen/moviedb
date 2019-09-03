package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
@NamedQuery(name = "Movie.deleteAllRows", query = "DELETE from Movie"),
@NamedQuery(name = "Movie.getAll", query = "SELECT m FROM Movie m"),
@NamedQuery(name = "Movie.getByName", query = "SELECT m FROM Movie m WHERE m.name LIKE :name")
})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Movie() {
    }
    private int year;
    private String name;
    private String[] actors;

    public Movie(int year, String name, String[] actors) {
        this.year = year;
        this.name = name;
        this.actors = actors;
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String[] getActors() {
        return actors;
    }
    
    
  

}


