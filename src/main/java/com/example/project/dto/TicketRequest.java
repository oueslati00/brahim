package com.example.project.dto;

import com.example.project.Data.Met;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class TicketRequest {
    private long numero;

    private LocalDateTime localDateTime;

    private Integer nbCouvert;

    private Double addition;

    private ClientRequest clientRequest;

    private List<Met> ListOfMet ;
}
