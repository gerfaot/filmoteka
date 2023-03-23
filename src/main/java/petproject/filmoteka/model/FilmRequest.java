package petproject.filmoteka.model;


import lombok.Data;

@Data
public class FilmRequest {
    private String title;
    private int mark;
    private String discription;
    private String comment;
}
