package com.example.project.Services;

import com.example.project.Data.Client;
import com.example.project.Data.Tab;
import com.example.project.Repository.TabRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    private TabRepository tableRepository;

    public List<Tab> getTables(){
        return tableRepository.findAll();
    }

    public Tab getBestTable(){
        List<Tab> table = getTables();

        Tab max= table.get(0);
        int maxNb = table.get(0).getListOfTicket().size();
        for (int i = 1; i < table.size() ; i++) {
            if(table.get(i).getListOfTicket().size()>maxNb) {
                max = table.get(i);
                maxNb = table.get(i).getListOfTicket().size();
            }
        }
        return max;
    }




}
