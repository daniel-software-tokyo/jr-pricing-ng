package example.domain.model.rules;

import example.domain.model.specification.Destination;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * のぞみ割増テーブル
 */
@Component
public class AdditionalChargeTable {

    Map<Destination, Integer> map =new EnumMap<Destination, Integer>(Destination .class);

    {
        map.put(Destination.新大阪, 320);
        map.put(Destination.姫路, 530);
    }

    public int additionalCharge(Destination destination) {
        return map.get(destination);
    }
}

