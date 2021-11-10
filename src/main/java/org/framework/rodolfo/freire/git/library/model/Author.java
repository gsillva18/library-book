package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_AUTOR")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTHOR_ID")
    private Long authorId;

    @Column(name = "AUTHOR_NOME")
    private String authorNome;

    @ManyToMany
    @JoinTable(name = "TB_BOOK_AUTHOR",
            joinColumns = @JoinColumn(name = "AUTHOR_FK"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_FK"))
    private List<Book> books;

}
