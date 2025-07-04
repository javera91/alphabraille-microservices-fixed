package com.alphabraille.participants.client;

import com.alphabraille.participants.dto.UsabilityDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USABILITY-MS", url = "${external.usability.api.base-url}")
public interface UsabilityFeignClient {

    @GetMapping("/api/usability/records")
    List<UsabilityDto> getUsabilityRecords();
}
