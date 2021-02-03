package com.example.project.Data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Met {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    private Double prix;

    private String type;

    @ManyToMany(mappedBy = "ListOfMet")

    private List<Ticket> ListOfTicket;


    public void setType(String type) throws Exception {
         switch(type){
             case "Entree" : this.type="Entree";
             break;
             case "Plat" : this.type="Plat";
             break;
             case "Dessert" : this.type="Dessert";
             break;
             default: throw new Exception(" type error");
         }

    }
}
