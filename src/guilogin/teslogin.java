/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilogin;

/**
 *
 * @author DYNABOOK
 */
public class teslogin {
    public static void main(String[] args){
        formlogin log = new formlogin();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(formlogin.EXIT_ON_CLOSE);
    }
    
}
