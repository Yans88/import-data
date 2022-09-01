package com.yansen.services;

import com.yansen.dtos.responses.ImportDTO;
import com.yansen.dtos.responses.ImportRequest;
import com.yansen.models.entities.ScheduleCoin;
import com.yansen.models.repositories.ScheduleCoinRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class ScheduleCoinService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    private ScheduleCoinRepo scheduleCoinRepo;

    public void saveData(List<ImportDTO> scheduleCoins) {
        List<ScheduleCoin> tutorials = new ArrayList<>();
        scheduleCoins.stream().map(post -> modelMapper.map(tutorials, ImportDTO.class))
                .collect(Collectors.toList());
        scheduleCoinRepo.saveAll(tutorials);
    }

    public void save(ImportRequest request) {
        ScheduleCoin scheduleCoin = convertToEntity(request);
        scheduleCoinRepo.save(scheduleCoin);
    }

    private ScheduleCoin convertToEntity(ImportRequest request) {
        return modelMapper.map(request, ScheduleCoin.class);
    }

    private ImportDTO convertToDto(ScheduleCoin scheduleCoin) {
        return modelMapper.map(scheduleCoin, ImportDTO.class);
    }


}
