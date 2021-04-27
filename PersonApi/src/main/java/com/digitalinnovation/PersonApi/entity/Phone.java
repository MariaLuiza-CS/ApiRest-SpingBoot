package com.digitalinnovation.PersonApi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.digitalinnovation.PersonApi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    toda vez que ele inserir um dado automaticamente, ele vai ser incremental
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
//    no momento que o JPA sobre o nome projeto, ele vai gerar um esqiuema de banco de dados, onde vai
//    criar essa canto como NOTNULL
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
