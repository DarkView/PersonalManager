/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalmanager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nils
 */
@XmlRootElement(name="MITARBEITERLISTE")
public class MitarbeiterListe {
    
    List<Mitarbeiter> mitarbeiter;

    public List<Mitarbeiter> getMitarbeiter()
    {
        return mitarbeiter;
    }

    /**
     * element that is going to be marshaled in the xml
     * @param mitarbeiter
     */
    @XmlElement( name = "MITARBEITER" )
    public void setMitarbeiter( List<Mitarbeiter> mitarbeiter )
    {
        this.mitarbeiter = mitarbeiter;
    }

    public void add( Mitarbeiter mitarbeiter )
    {
        if( this.mitarbeiter == null )
        {
            this.mitarbeiter = new ArrayList<Mitarbeiter>();
        }
        this.mitarbeiter.add( mitarbeiter );

    }

}
