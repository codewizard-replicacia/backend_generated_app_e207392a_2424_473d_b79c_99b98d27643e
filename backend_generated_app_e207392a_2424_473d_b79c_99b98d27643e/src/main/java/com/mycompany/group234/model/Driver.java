package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Driver;
import com.mycompany.group234.model.Bus;
import com.mycompany.group234.model.Route;
import com.mycompany.group234.enums.ShiftTime;
import com.mycompany.group234.converter.ShiftTimeConverter;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Driver")
@Table(name = "\"Driver\"", schema =  "\"generated_app\"")
@Data
                        
public class Driver {
	public Driver () {   
  }
	  
  @Id
  @Column(name = "\"DriverName\"", nullable = true )
  private String driverName;
	  
  @Column(name = "\"DrivingLicenseNumber\"", nullable = true )
  private Long drivingLicenseNumber;
  
	  
  @Column(name = "\"ExperienceInYears\"", nullable = true )
  private Integer experienceInYears;
  
	  
  @Column(name = "\"ShiftTime\"", nullable = false)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = ShiftTimeConverter.class)
  private ShiftTime shiftTime;
  
	  
  @Column(name = "\"VerificationStatus\"", nullable = true )
  private Boolean verificationStatus;
  
	  
  @Column(name = "\"LicenseExpiresAt\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date licenseExpiresAt;  
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"DriverBus\"", referencedColumnName = "\"BusId\"", insertable = false, updatable = false)
	private Bus bus;
	
	@Column(name = "\"DriverBus\"")
	private Long driverBus;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Driver [" 
  + "DriverName= " + driverName  + ", " 
  + "DrivingLicenseNumber= " + drivingLicenseNumber  + ", " 
  + "ExperienceInYears= " + experienceInYears  + ", " 
  + "ShiftTime= " + shiftTime  + ", " 
  + "VerificationStatus= " + verificationStatus  + ", " 
  + "LicenseExpiresAt= " + licenseExpiresAt 
 + "]";
	}
	
}