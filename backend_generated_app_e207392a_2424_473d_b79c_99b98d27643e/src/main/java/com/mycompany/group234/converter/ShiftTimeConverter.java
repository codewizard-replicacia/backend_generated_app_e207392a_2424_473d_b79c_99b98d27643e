package com.mycompany.group234.converter;

import com.mycompany.group234.enums.ShiftTime;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ShiftTimeConverter implements AttributeConverter<ShiftTime, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ShiftTime shiftTime) {
        return shiftTime != null ? shiftTime.ordinal() : null;
    }

    @Override
    public ShiftTime convertToEntityAttribute(Integer dbData) {
		return ShiftTime.getShiftTime(dbData);
    }
}
