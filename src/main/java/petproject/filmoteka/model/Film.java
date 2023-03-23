package petproject.filmoteka.model;


import lombok.Value;

@Value
public class Film {
    Long id;
    String title;
    int mark;
    String discription;
    String comment;

}
