package liga.medical.device.core.controller;

import liga.medical.DeviceIdentificationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    Logger logger = LoggerFactory.getLogger(DeviceController.class);

    private AmqpTemplate amqpTemplate;

    public DeviceController(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @PostMapping("/device")
    public ResponseEntity<String> send (@RequestBody DeviceIdentificationDto dto) {
        logger.info("Logger: Sending to queue [medical]");
        amqpTemplate.convertAndSend("medical", dto);
        return ResponseEntity.ok("Success sent to queue");
    }
}