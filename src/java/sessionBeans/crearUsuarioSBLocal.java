/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import javax.ejb.Local;

/**
 *
 * @author Kay
 */
@Local
public interface crearUsuarioSBLocal {

    public void crearUsuario(String username, String password);
    
}
