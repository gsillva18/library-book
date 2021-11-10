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
@Table(name = "TB_RACK")
public class Rack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUMBER_RACK")
    private int numberRack;

    @Column(name = "NUMBER_SHELF")
    private int numberShelf;

    @OneToMany
    @JoinColumn(name = "RACK_FK") //trocar relacionamento
    private List<Book> books;
}
