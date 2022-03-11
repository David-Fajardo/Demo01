package academy.digital.demo01.controller;


import academy.digital.demo01.caracter.Features;
import academy.digital.demo01.service.FeatureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/features")

public class FeatureController {

    private final FeatureService featureService;

    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping
    public Features getFeatures(){

        return featureService.getDescription();

    }





}
