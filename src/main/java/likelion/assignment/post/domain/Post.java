package likelion.assignment.post.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
@Setter
public class Post {

    private Long id;
    private String title;
    private String author;
    @CreatedDate
    private LocalDate createdDate;

    public Post(String title, String author, LocalDate createdDate) {
        this.title = title;
        this.author = author;
        this.createdDate = createdDate;
    }
}
