package com.mycompany.group234.function;

import com.mycompany.group234.model.Driver;
import com.mycompany.group234.model.Bus;
import com.mycompany.group234.model.Route;
import com.mycompany.group234.enums.ShiftTime;
import com.mycompany.group234.converter.ShiftTimeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.BusRepository;
import com.mycompany.group234.repository.DriverRepository;
import com.mycompany.group234.repository.RouteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
