package com.database.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;    
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




// We want the image in database so we don't use javax.


@Entity // This tells Hibernate to create a table of this class.
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    public class Glycan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //can do AUTO with batch test. Set to IDENTITY when I want default again. 
	//	By @GeneratedValue, JPA makes a unique key automatically and applies the key to the field having @Id
	private long id;
        private String databaseid; // maybe convert this to string. 
        private String oxford;
	private String neutralmass;
        private String subdir;
        private String experimentdetails;

        


	public Glycan() {

        }

        // The below constructor was created when I change generationidentity to auto. this will help me with batch inserts.        
        public Glycan(String databaseid, String oxford, String neutralmass, String subdir, String experimentdetails) {
            this.databaseid = databaseid;
            this.oxford = oxford;
            this.neutralmass = neutralmass;
            this.subdir = subdir;
            this.experimentdetails = experimentdetails;
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the databaseID
     */

    
    public String getDatabaseID() {
        return databaseid;
    }

    /**
     * @param databaseID the databaseID to set
     */
    public void setDatabaseID(String databaseID) {
        this.databaseid = databaseID;
    }

    /**
     * @return the oxford
     */
    public String getOxford() {
        return oxford;
    }

    /**
     * @param oxford the oxford to set
     */
    public void setOxford(String oxford) {
        this.oxford = oxford;
    }

    /**
     * @return the neutralmass
     */
    public String getNeutralmass() {
        return neutralmass;
    }

    /**
     * @param neutralmass the neutralmass to set
     */
    public void setNeutralmass(String neutralmass) {
        this.neutralmass = neutralmass;
    }

    /**
     * @return the observedmz
     */
    public String getSubdir() {
        return subdir;
    }

    /**
     * @param observedmz the observedmz to set
     */
    public void setSubdir(String s) {
        this.subdir = s;
    }

    /**
     * @return the ccs1
     */
    public String getExperimentdetails() {
        return this.experimentdetails; 
    }

    
    /**
     * @param ccs1 the ccs1 to set
     */
    public void setExperimentdetails(String e) {
        this.experimentdetails = e;
    }



}