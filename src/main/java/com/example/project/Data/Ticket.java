package com.example.project.Data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;

    private LocalDate date;
    private Integer nbCouvert;
    private Double addition;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Tab table;

    @ManyToMany
    @JoinTable(name = "TicketAndMet",
            joinColumns = @JoinColumn(name = "met_id"),
            inverseJoinColumns = @JoinColumn(name="ticket_id"))
    private List<Met> ListOfMet;


}
