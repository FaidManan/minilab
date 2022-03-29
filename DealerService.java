package com.eksadblaze.minilab.service;


import com.eksadblaze.minilab.domain.Dealer;
import com.eksadblaze.minilab.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DealerService {

    @Autowired
    DealerRepository dealerRepository;

    public Dealer saveDealer(Dealer dealerId){

        Dealer save = dealerRepository.save(dealerId);
        return save;
    }


}
