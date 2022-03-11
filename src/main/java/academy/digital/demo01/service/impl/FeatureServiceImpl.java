package academy.digital.demo01.service.impl;

import academy.digital.demo01.caracter.Features;
import academy.digital.demo01.service.FeatureService;
import org.springframework.stereotype.Service;

@Service
public class FeatureServiceImpl implements FeatureService {

    @Override
    public Features getDescription() {

        Features features=new Features();
        features.setRam(" 12 gb");
        features.setRom("500 gb");
        features.setProcessor("8Gz");
        features.setBattery("5000Ma");
        return features;
    }
}
