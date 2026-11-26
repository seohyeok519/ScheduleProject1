package org.example.scheduleproject1.controlloer;

import org.example.scheduleproject1.dto.ScheduleRequestDto;
import org.example.scheduleproject1.dto.ScheduleResponseDto;
import org.example.scheduleproject1.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleResponseDto> create(
            @RequestBody ScheduleRequestDto request) {

        ScheduleResponseDto result = scheduleService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}