package com.example.project.Data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Tab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;
    private Integer nb_couvert;
    private String type;
    private Double supplement;

    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
    private List<Ticket> ListOfTicket;


    public void setType(String type) {
        switch(type){
            case "PETITE_TERRAS" : this.type="PETITE_TERRAS";
            this.supplement= 12.00;
                break;
            case "GRANDTERRAS" : this.type="GRANDTERRAS";
                     this.supplement=16.00;
                break;
            case "MOYEN_TERRAS" : this.type="MOYEN_TERRAS";
                this.supplement=20.00;
                break;
            default: throw new RuntimeException(" type error");
        }

    }

    public Tab(long numero, Integer nb_couvert, String type) {
        this.numero = numero;
        this.nb_couvert = nb_couvert;
        setType(type);
    }
}
