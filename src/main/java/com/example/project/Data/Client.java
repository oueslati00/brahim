package com.example.project.Data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private  String curriel;
    private String number_phone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Ticket> ListOfTicket;

}
