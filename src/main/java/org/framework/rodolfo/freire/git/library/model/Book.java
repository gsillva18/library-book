package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;


@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_BOOK")
public class Book {

    @Id
    @Column(name = "BOOK_NAME")
    private String bookName;

    @ManyToMany(mappedBy = "books")
    private List<Author> bookAuthor;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<BookCategory> bookCategory;

    @Column(name = "BOOK_EDITION")
    private String bookEdition;

    @Column(name = "BOOK_QUANTITY")
    private int bookQuantity;

    @Column(name = "BOOK_STATUS")
    private boolean bookStatus;

}
