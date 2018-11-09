/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbb;

import javax.ejb.Stateless;

/**
 *
 * @author tiago.lucas
 */
@Stateless
public class Meu_EJB implements Meu_EJBLocal {

    @Override
    public String Treta() {
        return "Muita treta";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
