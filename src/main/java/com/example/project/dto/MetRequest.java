package com.example.project.dto;

import com.example.project.Data.Ticket;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MetRequest {

    private String nom;

    private Double prix;

    private String metType;

    private List<Ticket> ListOfTicket;
}
