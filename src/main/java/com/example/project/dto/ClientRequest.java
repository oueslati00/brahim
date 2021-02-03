package com.example.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
public class ClientRequest {

    private long id ;

    private String nom;

    private String prenom;

    private LocalDate date;

    private String curriel;

    private String telephone;

    private List<TicketRequest> ListOfTicket;

}
