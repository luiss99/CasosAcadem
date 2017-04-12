/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entities.Requisito;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kira Luis
 */
@Stateless
public class RequisitoFacade extends AbstractFacade<Requisito> {

    @PersistenceContext(unitName = "uesocc.tpi135_CasosAcadem-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequisitoFacade() {
        super(Requisito.class);
    }
    
}
