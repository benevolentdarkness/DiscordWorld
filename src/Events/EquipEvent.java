/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

/**
 *
 * @author User
 */
public class EquipEvent extends Event{

    public EquipEvent(String s) {
        super(s);
    }

    public boolean match(){
        return true;
    }

    @Override
    public void trigger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
