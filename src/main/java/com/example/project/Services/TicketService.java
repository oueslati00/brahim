package com.example.project.Services;

import com.example.project.Data.Met;
import com.example.project.Data.Ticket;
import com.example.project.Repository.TicketRepository;
import com.example.project.dto.TicketRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TicketService {

    private TicketRepository ticketRepository;

    public List<Ticket> getTicket() {
        return ticketRepository.findAll();
    }

    public Met getBestPlat(LocalDate localDateDebut, LocalDate localDateFin) {
        List<Ticket> ListOfTicket = getTicket();
        List<Met> newListOfMet = new ArrayList<>();

        for (int i = 0; i < ListOfTicket.size(); i++) {
            LocalDate localDate = ListOfTicket.get(i).getDate();
            List<Met> ListOfMet = ListOfTicket.get(i).getListOfMet();
            if (localDate.isAfter(localDateDebut) && localDate.isBefore(localDateFin))
                for (int j = 0; j < ListOfMet.size(); j++) {
                    if (ListOfMet.get(j).getType().equals("Plat"))
                        newListOfMet.add(ListOfMet.get(j));
                }


        }
        // select from ListOfMet Le Plat le plus acheter
        return null;
    }



}
