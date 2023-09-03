package com.mycompany.group234.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ShiftTime{
	    Morning,
	    Evening,
	    Night; 
    public int value(ShiftTime shiftTime) {
        return shiftTime.ordinal();
    }
    public static ShiftTime getShiftTime(int ordinal) {
        for(ShiftTime shiftTime : ShiftTime.values())
                if(shiftTime.ordinal() == ordinal)
                        return shiftTime;
        return null;
    }
}


