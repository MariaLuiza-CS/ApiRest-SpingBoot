package com.digitalinnovation.PersonApi.entity;

import javassist.expr.Cast;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    //so vai poder cadastrar pessoas com CPFs unicos
    private String cpf;

    @Column(nullable = false)
    private LocalDate birthdate;

    @Column(nullable = false)
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE
            , CascadeType.REMOVE})
    private List<Phone> phones;

}
