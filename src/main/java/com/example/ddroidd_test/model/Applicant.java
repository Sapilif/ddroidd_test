package com.example.ddroidd_test.model;
import jakarta.persistence.*;
import lombok.*;

/*

Aplicant - persoana ce poate aplica la un job listing

id - long
firstName - string
lastName - string

 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
