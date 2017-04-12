/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entities.TipoRequisito;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Kira Luis
 */
@Named(value = "tipoRequisitoController")
@RequestScoped
public class TipoRequisitoController {

    @EJB
    private SessionBeans.TipoRequisitoFacade tipoRequisitoFacade;

    public List<TipoRequisito> findAll(){
        return this.tipoRequisitoFacade.findAll();
    }
    
    public TipoRequisitoController() {
    }
    
}
