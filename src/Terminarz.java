
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jan Nowak <jan at nowak.org>
 */
public class Terminarz {
    public Date data; 
    private void setTermin (int Y, int m, int d, int h, int i)
    {
        data = new Date (Y, m, d, h, i);
    }
}
